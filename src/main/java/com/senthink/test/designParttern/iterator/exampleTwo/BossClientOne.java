package com.senthink.test.designParttern.iterator.exampleTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;


/**
 * Created by lenovo on 2018/3/28.
 */
public class BossClientOne {

    private final static Logger LOGGER = LoggerFactory.getLogger(BossClientOne.class);

    public static void main(String[] args) {

        IProjectOne project = new ProjectOne();
        project.add("星球大战", 10, 100);
        project.add("扭转时空", 1, 200);

        //testArrayList();

        IProjectIterator iProjectIterator = project.iterator();
        while (iProjectIterator.hasNext()) {
            LOGGER.debug("main has");
            IProjectOne p = (IProjectOne) project.iterator().next();
            String info = p.getProjectInformation();
            LOGGER.debug("info=" + info);
        }

    }

    private static void testArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("string");
        list.add("nnn");
        int i = 0;
        for (int j = 0; j < 8; j++) {
            if (list.get(i) == null) {
                break;
            }
            LOGGER.debug("s" + list.get(i++));
        }

    }
}
