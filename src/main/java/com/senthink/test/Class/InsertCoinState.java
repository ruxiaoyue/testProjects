package com.senthink.test.Class;

import com.senthink.test.Service.VendingMechineState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by lenovo on 2017/11/27.
 */
public class InsertCoinState implements VendingMechineState {
    private VendingMechineUpdate machine;

    private Random random;

    private final static Logger LOGGER = LoggerFactory.getLogger(InsertCoinState.class);

    public InsertCoinState(VendingMechineUpdate machine) {
       this.machine = machine;
       this.random = new Random();
    }

    @Override
    public void insertCoin() {
        LOGGER.debug("您已经投币 无需再投~~~~~");
    }
    @Override
    public void turnCruak() {
        LOGGER.debug("您转动了手柄~~~~~");
        int randomInt = random.nextInt(10);
        LOGGER.debug("randomInt={}", randomInt);

        if (randomInt < 5 && machine.getCount() > 0) {
            machine.setState(machine.getWinnerState());
        }else {
            machine.setState(machine.getSoldState());
        }
    }
    @Override
    public void backMoney() {
        LOGGER.debug("退币成功~~~");
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void dispend() {
       LOGGER.warn("error state");
    }
}
