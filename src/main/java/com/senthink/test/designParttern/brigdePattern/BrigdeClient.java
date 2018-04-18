package com.senthink.test.designParttern.brigdePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/19.
 */
public class BrigdeClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(BrigdeClient.class);

    public static void main(String[] args) {
        AbstractRoad speed = new SpeedWay();
        speed.abstractCar = new Car();

       /* AbstractRoad street = new StreetRoad();
        street.abstractCar = new Bus();*/
        People man = new Man();
        man.road = speed;
        man.run();
        //People woman = new Woman();
        //woman.road = street;
        //woman.run();


        /*speed.run();
        street.run();*/
    }


}
