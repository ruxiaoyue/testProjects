package com.senthink.test.Util;

import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2017/12/1.
 */
public class DateUtil {

    private final static Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    /**
     * beacon偏差值 单位s
     */
    private final static Long offset = 1000l;

    private final static String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 获取当前时间前一次 下一次beacon开始时间
     */
    public JsonObject getBeaconStartTime() {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_FORMAT);
        Date date = new Date();
        long time = date.getTime()/1000;
        long mod = Math.floorMod(time - offset, 128l);
        long beaconStartNext = time + (128l - mod);
        Date beaconNextDate = new Date(beaconStartNext*1000);
        long beaconBefore = beaconStartNext - 128;
        Date beaconBeforeDate = new Date(beaconBefore*1000);
        String beaconBeforeString = format.format(beaconBeforeDate);
        String beaconNextString = format.format(beaconNextDate);
        JsonObject beaconTimeJson = new JsonObject().put("before", beaconBeforeString).put("after", beaconNextString);
        return beaconTimeJson;
    }

    /**
     * 将date时间转化成string形式
     * @param date
     * @return
     */
    public String formatTime (Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_FORMAT);
        return format.format(date);
    }

    /**
     * 获取当前时间
     */
    public String getNow() {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_FORMAT);
        Date date = new Date();
        return format.format(date);
    }
}
