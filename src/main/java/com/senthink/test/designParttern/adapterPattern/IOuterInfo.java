package com.senthink.test.designParttern.adapterPattern;

import java.util.Map;

/**
 * Created by lenovo on 2018/3/29.
 */
public interface IOuterInfo {

    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();
}
