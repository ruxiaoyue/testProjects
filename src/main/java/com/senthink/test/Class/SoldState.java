package com.senthink.test.Class;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.VendingMechineState;

/**
 * Created by lenovo on 2017/11/27.
 */
public class SoldState implements VendingMechineState{

    private VendingMechineUpdate machine;

    private final static Logger LOGGER = LoggerFactory.getLogger(SoldState.class);

    public SoldState(VendingMechineUpdate machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(){
        LOGGER.debug("正在出货 请勿投币");
    }

    @Override
    public void turnCruak() {
        LOGGER.debug("商品正在出货 请勿重复转动手柄！！！！");
    }

    @Override
    public void backMoney() {
        LOGGER.debug("商品正在出货 不能退币！！！！！");
    }

    @Override
    public void dispend(){
        machine.dispend();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoMoneyState());
        }else {
            LOGGER.debug("商品已售罄");
            machine.setState(machine.getSoldOutState());
        }
    }
}
