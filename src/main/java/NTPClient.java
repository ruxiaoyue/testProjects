import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Util.DateUtil;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 从NTP服务器获取时间
 * Created by hyacinth on 2017/12/1.
 */
public class NTPClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(NTPUDPClient.class);

    public static void main(String[] args) {

        InetAddress address = null;
        DateUtil dateUtil = new DateUtil();

        try{
            //address = InetAddress.getByName("202.120.2.101");
            address = InetAddress.getByName("cn.pool.ntp.org");
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            NTPUDPClient client = new NTPUDPClient();
            TimeInfo timeInfo = client.getTime(address);
            TimeStamp timeStamp = timeInfo.getMessage().getTransmitTimeStamp();
            String time = dateUtil.formatTime(timeStamp.getDate());
            LOGGER.debug("ntpTime={}", time);
            LOGGER.debug("now={}", dateUtil.getNow());
        }catch (SocketException e) {
            e.printStackTrace();
            LOGGER.debug("socketException={}", e.getCause());
        }catch (IOException ioexception) {
            ioexception.printStackTrace();
            LOGGER.debug("ioeException ::{}", ioexception.getCause());
        }
    }
}
