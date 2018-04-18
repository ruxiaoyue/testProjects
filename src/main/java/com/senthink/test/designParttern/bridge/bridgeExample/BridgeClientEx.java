package com.senthink.test.designParttern.bridge.bridgeExample;


/**
 * Created by lenovo on 2018/4/3.
 */
public class BridgeClientEx {

    public static void main(String[] args) {
        House house = new House();
        HouseCorpEx houseCorp = new HouseCorpEx(house);
        houseCorp.makeMoney();

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new ClothesEx());
        shanZhaiCorp.makeMoney();
    }
}
