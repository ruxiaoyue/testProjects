package com.senthink.test.designParttern.factory.simple;

import com.senthink.test.designParttern.factory.BMW320;
import com.senthink.test.designParttern.factory.BMW523;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**简单工厂类
 * Created by lenovo on 2018/3/15.
 */
public class FactoryExample {

    private String type;

    private final static Logger LOGGER = LoggerFactory.getLogger(FactoryExample.class);

    public FactoryExample(String type) {
        this.type = type;
    }

    public BMW product() {
        switch (this.type) {
            case "BMW320":
                BMW bmw = new BMW320();
                return bmw;
            case "BMW523":
                return new BMW523();
            default:
                return new BMW();
        }
    }
}
