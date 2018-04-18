package com.senthink.test.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by lenovo on 2018/3/12.
 */
public class PrototypeDesign {

    private final static int MAX_COUNT = 5;

    private final static Logger LOGGER = LoggerFactory.getLogger(PrototypeDesign.class);

    public static void main(String[] args) {
        //MailTemp mailTemp = new MailTemp();

        Mail mail = new Mail(new MailTemp());

        try{
            Mail cloneMail = mail.clone();

            cloneMail.setTail("hangzhou band");

            for (int i = 0; i < MAX_COUNT; i++) {
                cloneMail.setSubscribe(getRandString(5) + "man");
                cloneMail.setReciver(getRandString(8) + "@.com");
            }
            LOGGER.debug("send email suscribe {} to {} success tail is {}", mail.getSubscribe(), mail.getReciver(), mail.getTail());
        }catch (Exception e) {
            LOGGER.debug("e ={}", e.getCause());
        }


    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
