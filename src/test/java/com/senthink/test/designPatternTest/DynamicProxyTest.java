package com.senthink.test.designPatternTest;

import com.senthink.test.Service.impl.proxyImpl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.senthink.test.Service.proxyService.IGamePlayer;
import com.senthink.test.Service.proxyService.IGamePlayerOne;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2018/1/31.
 */
public class DynamicProxyTest {

    private GamePlayer gamePlayer;

    private GamePlyerProxy gamePlyerProxy;

    private GamePlyerProxy2 proxy2;

    private GamePlyerOne gamePlyerOne;

    private IGamePlayerOne proxy;

    private final static Logger LOGGER = LoggerFactory.getLogger(DynamicProxyTest.class);

    /*public static void main(String[] args) throws Exception{
        //目标对象
        CarRealSubject car = new CarRealSubject();
        InvocationHandler invocationHandler = new TimeHandler(car);
        Class<?> cls = car.getClass();
        MoveAble m = (MoveAble) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), invocationHandler);
        m.move();
        *//*Isubject isubject = new RealSubject();
        LOGGER.debug("class ={}", isubject.getClass());
        Isubject proxy = (Isubject) new ProxyFactory(isubject).getProxyInstance();
        LOGGER.debug("proxy class ={}", proxy.getClass());
        proxy.doSomething();*//*

    }*/

    @BeforeTest
    public void before() {
        LOGGER.debug("before");
        /*gamePlayer = new GamePlayer("张三");
        gamePlyerProxy = new GamePlyerProxy(gamePlayer);*/
        //gamePlyerProxy = new GamePlyerProxy("张三");
        gamePlayer = new GamePlayer("张三d");
        proxy2 = new GamePlyerProxy2(gamePlayer);

        /*gamePlyerOne = new GamePlyerOne("tony");
        proxy = gamePlyerOne.getProxy();*/
    }

    @Test
    public void testGamePlayer() {
        /*gamePlayer.login("lemon", "010203");
        gamePlayer.killBoss();
        gamePlayer.upgrade();*/
        proxy2.login("leng", "123456");
        proxy2.killBoss();
        proxy2.upgrade();
        proxy2.count();
    }

    /**
     * 测试普通代理
     */
    @Test
    public void testProxyGamePlayer() {
        gamePlyerProxy.login("lemon", "123456");
        gamePlyerProxy.killBoss();
        gamePlyerProxy.upgrade();
    }

    /**
     * 测试强制代理
     */
    @Test
    public void testProxyGamePlayerOne() {
        /*gamePlyerOne.login("lemon", "123456");
        gamePlyerOne.killBoss();*/
        proxy.login("lemon", "123456");
        proxy.killBoss();
        proxy.upgrade();

    }

    /**
     * 测试动态代理
     */
    @Test
    public void testDynamicProxy() {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(gamePlayer);

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, handler);
        proxy.login("tom", "123456");
        proxy.killBoss();
        proxy.upgrade();

    }
}
