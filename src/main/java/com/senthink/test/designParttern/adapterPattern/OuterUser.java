package com.senthink.test.designParttern.adapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/3/29.
 */
public class OuterUser implements IOuterInfo{

    public Map getUserBaseInfo() {
        HashMap map = new HashMap();
        map.put("userName", "jeck");
        map.put("mobileNumber", "22211ff");
        return map;
    }

    public Map getUserHomeInfo() {
        HashMap map = new HashMap();
        map.put("homeTelNumber", "125232");
        map.put("homeAddress", "杭州余杭");
        return map;
    }

    public Map getUserOfficeInfo() {
        HashMap map = new HashMap();
        map.put("jobPosition", "boss");
        map.put("officeTelNumber", "12536589");
        return map;
    }
}
