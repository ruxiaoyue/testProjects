package com.senthink.test;

import com.senthink.test.Class.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hyacinth on 2018/1/16.
 */
public class staticClassTest {

    private final static long va = 45l;

    private final static Logger LOGGER = LoggerFactory.getLogger(staticClassTest.class);

    private final static Map<String, String> map = new ConcurrentHashMap<>();


    public static void main(String[] args) {
        Person p1 = new Person("p1", "femal", 10);
        Person p2 = new Person("p2", "male", 12);
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        p1.setAge(52);
        set.remove(p1);
        methodB();
        map.put("01", "01");
        map.remove("01");
        LOGGER.debug("size={}", map.size());
        for (int i = 0; i < map.size() ; i++) {
            //Set set = map.entrySet();
            //LOGGER.debug("i={}, map={}", i, set.iterator().next());
        }
    }

    public static void methodB() {
        map.put("02", "02");
        map.put("01", "03");
        LOGGER.debug("methodB map size={}", map.size());
    }
}
