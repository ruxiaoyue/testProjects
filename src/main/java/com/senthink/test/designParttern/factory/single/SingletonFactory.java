package com.senthink.test.designParttern.factory.single;

import java.lang.reflect.Constructor;

/**
 * Created by lenovo on 2018/3/26.
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try{
            Class cl = Class.forName(Singleton.class.getName());

            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
