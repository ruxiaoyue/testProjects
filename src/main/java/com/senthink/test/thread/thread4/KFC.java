package com.senthink.test.thread.thread4;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by lenovo on 2018/3/9.
 */
public class KFC {

    private String[] names = new String[] {"chicken", "tomato", "potato", "inc cream"};

    private static int max = 20;

    private List<Food> foods = Lists.newArrayList();

    private final static Logger LOGGER = LoggerFactory.getLogger(KFC.class);

    public void produce(int index) {
        synchronized (this) {
            while (foods.size() > max) {
                LOGGER.debug("food is enough");
                this.notifyAll();
                try{
                    String name = Thread.currentThread().getName();
                    LOGGER.debug("thread name={}", name);
                    this.wait();
                }catch (InterruptedException e) {
                    LOGGER.debug("e ={}", e.getCause());
                }
            }

            for (int i = 0; i < index; i++) {
                Food food = new Food(names[(int)Math.random() *4]);
                foods.add(food);
                LOGGER.debug("product food name is={}", food.getName());
            }
        }
    }

    public void consume(int index) {
        synchronized (this){
            while (foods.size() < index) {
                LOGGER.debug("the food is not enough");
                this.notifyAll();

                try {
                    String name = Thread.currentThread().getName();
                    LOGGER.debug("concurrent thread name is ={}", name);
                    this.wait();
                }catch (InterruptedException e) {
                    LOGGER.debug("e ={}", e.getCause());
                }
            }

            for (int i = 0; i < index; i++) {
                Food food = foods.remove(foods.size() -1);
                LOGGER.debug("consumer one food name={}", food.getName());
            }
        }
    }
}
