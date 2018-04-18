package com.senthink.test.designParttern.strategyParttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/22.
 */
public class StrategyClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(StrategyClient.class);

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcrecteStrategy1());
        context.operate();

        context = new Context(new ConcrecteStrategy2());
        context.operate();

        context = new Context(new ConcrecteStrategy3());
        context.operate();
    }
}
