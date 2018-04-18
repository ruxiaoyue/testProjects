package com.senthink.test.Service;

/**
 * Created by lenovo on 2017/11/27.
 */
public interface VendingMechineState {

    /**
     * 投币
     */
    void insertCoin();

    /**
     * 转动手柄
     */
    void turnCruak();

    /**
     * 退币
     */
    void backMoney();

    /**
     * 发出商品
     */
    void dispend();


}
