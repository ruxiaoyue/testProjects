import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.net.URL;

/**
 * Created by lenovo on 2018/3/29.
 */
public class HttpsExampleTest {

    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ssZ")
            .setPrettyPrinting()
            .create();

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpsExampleTest.class);

    public static void main(String[] args) {

        //invokeHttpPostRequest();
        JsonObject loraReqInfo = new JsonObject();
        //LoraReqInfo loraReqInfo = new LoraReqInfo();
        //loraReqInfo.setData("aaaaaaa");
        loraReqInfo.put("data", "aaaa");
        String body = GSON.toJson(loraReqInfo);
        String s = invokeHttpsRequest("https://ceshi.icloudcare.com/icare/lora", "POST", body);
        //Logger.info(s);
        LOGGER.debug("s" + s);

    }

    /*private static void invokeHttpPostRequest() {

        HttpURLConnection http;
        try {
            URL url = new URL("https://10.100.10.123:8888/lora");
            http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("POST");
            http.setConnectTimeout(5 * 1000);
            http.setDoInput(true);
            http.setDoOutput(true);
            http.setUseCaches(false);
            http.setRequestProperty("Charsert", "utf-8");
            http.connect();

            LoraReqInfo loraReqInfo = new LoraReqInfo();
            loraReqInfo.setData("aaaaaaa");

            String body = GSON.toJson(loraReqInfo);

            OutputStream out = http.getOutputStream();
            out.write(body.getBytes());
            out.flush();
            out.close();
            int code = http.getResponseCode();
            if (code == 200) {
                Logger.info("ok");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static String invokeHttpsRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            //创建SSLContext
            SSLContext sslContext = SSLContext.getInstance("SSL");
            //TrustManager[] tm = {new TJX509TrustManager()};
            //初始化
            sslContext.init(null, null, new java.security.SecureRandom());
            //获取SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            conn.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            });
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(requestMethod);
            //设置当前实例使用的SSLSoctetFactory
            conn.setSSLSocketFactory(ssf);
            conn.connect();
            //往服务器端写内容
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
            }

            //读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
