package com.senthink.test.Class;

import com.senthink.test.Service.VendingMechineState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2017/11/27.
 */
public class WinnerState implements VendingMechineState {

    public VendingMechineUpdate mechineUpdate;

    private final static Logger LOGGER = LoggerFactory.getLogger(WinnerState.class);

    public WinnerState(VendingMechineUpdate machine) {
        this.mechineUpdate = machine;
    }

    public void insertCoin() {}
    public void turnCruak(){
        dispend();
    }
    public void backMoney(){}
    @Override
    public void dispend() {
        LOGGER.debug("winner state dispend");
        LOGGER.debug("恭喜您中奖了！！！额外获得一瓶");
        mechineUpdate.dispend();
        if (mechineUpdate.getCount() == 0) {
            LOGGER.debug("商品已售罄");
            mechineUpdate.setState(mechineUpdate.getSoldOutState());
        }else {
            mechineUpdate.dispend();
            if (mechineUpdate.getCount() > 0) {
                mechineUpdate.setState(mechineUpdate.getNoMoneyState());
            }else {
                LOGGER.debug("商品已售罄");
                mechineUpdate.setState(mechineUpdate.getSoldOutState());
            }

        }
    }
}
