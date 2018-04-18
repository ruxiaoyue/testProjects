package com.senthink.test.designParttern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/4/3.
 */
public class BridgeClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(BridgeClient.class);

    public static void main(String[] args) {
        LOGGER.debug("-----------房地产公司是这样运行的----------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        LOGGER.debug("======服装公司是这样运行的======");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
        LOGGER.debug("+++++++++ipod公司这样运行的++++++");
        IpodCorp ipodCorp = new IpodCorp();
        ipodCorp.makeMoney();
    }
}
