package com.senthink.test.Service.impl.proxyImpl;

import com.senthink.test.Service.proxyService.IGamePlayerOne;

/**
 * Created by lenovo on 2018/2/1.
 */
public class GamePlyerProxyOne implements IGamePlayerOne {

    private GamePlyerOne player;

    public GamePlyerProxyOne(GamePlyerOne gamePlyerOne){
        this.player = gamePlyerOne;
    }

    public void login(String user, String password){
        player.login(user, password);
    }

    public void killBoss(){ player.killBoss(); }

    public void upgrade() { player.upgrade(); }

    public IGamePlayerOne getProxy() { return this; }


}
