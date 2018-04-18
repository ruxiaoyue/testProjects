package com.senthink.test.designParttern.responsebility;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

/**
 * Created by lenovo on 2018/3/21.
 */
public class ResponseClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(ResponseClient.class);

    public static void main(String[] args) {
        Random random = new Random(5);
        random.nextInt();

        IHandler father = new Father();

        IHandler husband = new Husband();
         IHandler son = new Son();

         father.setNext(husband);
         husband.setNext(son);

        List<WomanImpl> womens = Lists.newArrayList();
        for (int i = 0; i < 5 ; i++) {
            womens.add(new WomanImpl(random.nextInt(4), "逛街"));
        }
        for (WomanImpl woman:womens) {
            father.handlerMessage(woman);
        }

    }
}
