package com.senthink.test.Service.impl.proxyImpl;

import com.senthink.test.Service.proxyService.IGamePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/2/1.
 */
public class GamePlyerProxy implements IGamePlayer {

    private String name;

    private IGamePlayer player;

    private final static Logger LOGGER = LoggerFactory.getLogger(IGamePlayer.class);

    public GamePlyerProxy(String name) {
        this.name = name;
        this.player = new GamePlayer(name);
    }

    public void login(String user, String password) {
        player.login(user, password);
    }

    public void killBoss() {
        player.killBoss();
    }

    public void upgrade() {
       player.upgrade();
    }
}
