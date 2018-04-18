package com.senthink.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * generic test
 * Created by hyacinth on 2017/12/26.
 */
 public class GenericTest {

     private final static Logger LOGGER = LoggerFactory.getLogger(GenericTest.class);

     public static void main(String[] args) {
         /*GenericClass<String> genericClass = new GenericClass<String>();
         genericClass.setFile("generic sting");
         LOGGER.debug("out ={}", genericClass.getFile());

         GenericClass<Integer> genericInteger = new GenericClass<>();
         genericInteger.setFile(12);
         LOGGER.debug("intOut={}", genericInteger.getFile());

         GenericDemo demo = new GenericDemo();*/
         /*List<String> stringList = demo.newArray();
         stringList.add("ff");
         stringList.add("12");
         demo.show(stringList);
         List<Long> longList = demo.newArray();
         longList.add(11l);
         longList.add(45l);
         demo.show(longList);*/
         /*demo.out(12);
         demo.out(15l);
         demo.out(45d);*/
         List list = new ArrayList();
         list.add("hh");
         list.add(12);
         list.add(12l);
         for (Object l:list) {

         }

  }

}

