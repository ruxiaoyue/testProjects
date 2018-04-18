package com.senthink.test.Service.impl.proxyImpl;

import com.senthink.test.Service.proxyService.IGamePlayerOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2018/2/1.
 */


public class GamePlyerOne implements IGamePlayerOne {

    private String name;

    private IGamePlayerOne proxy;

    private final static Logger LOGGER = LoggerFactory.getLogger(GamePlyerOne.class);

    public GamePlyerOne(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        if (isProxy()) {
            LOGGER.debug("请指定代理");
            return;
        }else {
            LOGGER.debug("用户：{} 登录号码user:{} login success", name, user);
        }

    }

    public void killBoss(){
        if (isProxy()) {
            LOGGER.debug("请指定代理");
        }else {
            LOGGER.debug("用户：{} start to killBoss....", this.name);
        }

    }

    public void upgrade() {
        if(isProxy()) {
            LOGGER.debug("请指定代理");
        }else {
            LOGGER.debug("{} start to upgrade....", this.name);
        }
    }

    public IGamePlayerOne getProxy() {
        this.proxy = new GamePlyerProxyOne(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return true;
        }else {
            return false;
        }
    }
}
