package com.senthink.test.Class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.VendingMechineState;

/**
 * Created by lenovo on 2017/11/27.
 */
public class SoldOutState implements VendingMechineState{

    private VendingMechineUpdate mechineUpdate;

    private final static Logger LOGGER = LoggerFactory.getLogger(SoldOutState.class);

    public SoldOutState(VendingMechineUpdate mechineUpdate) {
        this.mechineUpdate = mechineUpdate;
    }

    @Override
    public void insertCoin(){
        LOGGER.debug("商品已售罄 请勿投币~~~~");
    }
    @Override
    public void turnCruak() {
        LOGGER.debug("商品已售罄 转动手柄也没用！！！");
    }
    @Override
    public void backMoney() {
        LOGGER.debug("您未投币 无法退币！！！");
    }
    @Override
    public void dispend(){
        LOGGER.warn("商品售罄 不能出货！！！");
    }
}
