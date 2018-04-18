package com.senthink.test.Service.impl.proxyImpl;

import com.senthink.test.Service.proxyService.IGamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/1.
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    /*public GamePlayer(IGamePlayer gamePlayer, String name) {
        if (gamePlayer != null) {
            this.name = name;
        }else {
            LOGGER.debug("不能创建实例对象！");
        }
    }*/

    public GamePlayer(String name) {
        this.name = name;
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(GamePlayer.class);

    public void login(String user, String password) {
        LOGGER.debug("登录名为:{}的用户:{} login success", name, user);
    }

    public void killBoss() {
        LOGGER.debug("{} killBoss......", this.name);
    }

    public void upgrade() {
        LOGGER.debug("{} upgrade ......", this.name);
    }
}
