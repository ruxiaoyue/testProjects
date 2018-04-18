package com.senthink.test.Class;

import com.senthink.test.Service.VendingMechineState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/11/27.
 */
public class NoMoneyState implements VendingMechineState {


    private VendingMechineUpdate machine;

    private final static Logger LOGGER = LoggerFactory.getLogger(NoMoneyState.class);

    public NoMoneyState(VendingMechineUpdate mechineUpdate) {
        this.machine = mechineUpdate;
    }

    public void turnCruak() {
        LOGGER.debug("请先投币~~~");
    }

    public void insertCoin() {
        LOGGER.debug("投币成功~~~");
        if (machine.getCount() > 0) {
            machine.setState(machine.getInsertCoinState());
        }else {
            machine.setState(machine.getSoldOutState());
            LOGGER.debug("已售罄 请勿投币");
        }
    }

    public void backMoney() {
        LOGGER.debug("您未投币！！！");
    }

    public void dispend() {
        LOGGER.debug("请先投币");
    }
}
