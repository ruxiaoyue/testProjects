package com.senthink.test.Service.proxyService;

/**
 * 强制代理抽象subject
 * Created by lenovo on 2018/2/1.
 */
public interface IGamePlayerOne {

    void login(String user, String password);

    void killBoss();

    void upgrade();

    IGamePlayerOne getProxy();
}
