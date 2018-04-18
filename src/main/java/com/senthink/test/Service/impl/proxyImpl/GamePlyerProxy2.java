package com.senthink.test.Service.impl.proxyImpl;

import com.senthink.test.Service.proxyService.IGamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.proxyService.IProxy;

/**
 * Created by lenovo on 2018/2/1.
 */
public class GamePlyerProxy2 implements IGamePlayer, IProxy{

    private GamePlayer gamePlayer;

    private final static Logger LOGGER = LoggerFactory.getLogger(GamePlyerProxy2.class);

    public GamePlyerProxy2(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void login(String user, String password) {
        gamePlayer.login(user, password);
    }

    public void killBoss() {
        gamePlayer.killBoss();
    }

    public void upgrade() {
        gamePlayer.upgrade();
    }

    public void count() {
        LOGGER.debug("用户的升级费用是150");
    }
}
