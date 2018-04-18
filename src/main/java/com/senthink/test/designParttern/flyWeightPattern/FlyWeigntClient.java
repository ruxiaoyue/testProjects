package com.senthink.test.designParttern.flyWeightPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/4/2.
 */
public class FlyWeigntClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(FlyWeigntClient.class);

    public static void main(String[] args) {

        //SignInfo signInfo = SignInfoFactory.getSignInfo();

        //初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 5; j++) {
                String key = subject + "考试地点" + j;
                LOGGER.debug("key={}", key);

                SignInfo signInfo = SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
