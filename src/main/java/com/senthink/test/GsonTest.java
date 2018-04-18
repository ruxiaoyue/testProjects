package com.senthink.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lenovo on 2018/3/29.
 */
public class GsonTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(GsonTest.class);

    public static void main(String[] args) {
        JsonObject json = new JsonObject();
        json.put("data", "0102");
        String b = "30313032";
        json.put("b", b);

        Gson gson = new GsonBuilder().create();
        String mm = gson.toJson(json);
        LOGGER.debug("mm={}", mm);

    }


    /*private String readData(HttpServletRequest request) throws IOException {
        BufferedReader br = request.getReader();
        String str, wholeStr = "";
        while ((str = br.readLine()) != null) {
            wholeStr += str;
        }
        return wholeStr;
    }*/



    //@Override
    /*protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(StringUtils.UTF_8);
        resp.setCharacterEncoding(StringUtils.UTF_8);
        DbSession session = HibernateUtils.newSession();
        GZIPOutputStream os = null;

        try {

            session.beginTransaction();
            //Response response = new Response(Response.OK);
            String raw = readData(req);
            Logger.error("lora:" + raw);*/
}
