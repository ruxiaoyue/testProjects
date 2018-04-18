package com.senthink.test.dataStructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hyacinth on 2018/3/6.
 */
public class ReadOnlyExample {

    private final static Logger LOGGER = LoggerFactory.getLogger(ReadOnlyExample.class);

    public static void main(String[] args) {
        try{
            Set<String> set = new HashSet<>();
            set.add("one");
            set.add("two");
            set.add("three");
            set.add("four");
            set.add("five");
            set = Collections.unmodifiableSet(set);
            LOGGER.debug("size={}", set.size());
            set.add("nm");
            LOGGER.debug("end size+{}", set.size());
        }catch (Exception e) {
            LOGGER.debug("e ={}", e.getMessage());
            e.printStackTrace();
        }

    }
}
