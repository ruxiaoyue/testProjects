package com.senthink.test.prototype.exampleTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by lenovo on 2018/3/12.
 */
public class SheepTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(SheepTest.class);

    public static void main(String[] args) {
        Date date = new Date(1274397294739L);
        Admin admin = new Admin("woman", 25);
        Sheep sheep = new Sheep("xiong", 12, date);

        LOGGER.debug("sheep old ={}", sheep.toStringWithoutAdmin());
        try{
            Sheep cloneSheep = sheep.startClone();
            LOGGER.debug("clone sheep ={}", cloneSheep.toStringWithoutAdmin());
            cloneSheep.setAge(10);
            cloneSheep.setSex("ci");
            date.setTime(44732834827389L);
            //cloneSheep.setBirthday(new Date(44732834827389L));
            //cloneSheep.setAdmin(new Admin("sffaf", 100));
            LOGGER.debug("sheep clone ={}", cloneSheep.toStringWithoutAdmin());
        }catch (CloneNotSupportedException e) {
            LOGGER.debug("e={}", e.getMessage());
        }
        LOGGER.debug("sheep old={}", sheep.toStringWithoutAdmin());

    }
}
