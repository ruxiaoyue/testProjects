package com.senthink.test.Class;

import com.senthink.test.Service.VendingMechineState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hyacinth on 2017/11/27.
 */
public class VendingMechineUpdate {

    private VendingMechineState noMoneyState;

    private VendingMechineState insertCoinState;

    private VendingMechineState soldState;

    private VendingMechineState soldOutState;

    private VendingMechineState winnerState;

    private VendingMechineState currentState = noMoneyState;

    private final static Logger LOGGER = LoggerFactory.getLogger(VendingMechineUpdate.class);

    private int count = 0;

    public VendingMechineUpdate(int count) {
        this.noMoneyState = new NoMoneyState(this);
        this.insertCoinState = new InsertCoinState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void turnCruak() {
        currentState.turnCruak();
        if (currentState == soldState || currentState == winnerState) {
            currentState.dispend();
        }else {
            LOGGER.debug("请先投币！！！");
        }
    }

    public void backMoney() {
        currentState.backMoney();
    }

    public void dispend() {
        LOGGER.debug("发出一件商品~~~~~");
        if (count!= 0) {
            count--;
        }
        LOGGER.debug("售出后商品的数量count={}", count);
    }

    public void setState(VendingMechineState state) {
        this.currentState = state;
    }

    public VendingMechineState getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(VendingMechineState noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public VendingMechineState getInsertCoinState() {
        return insertCoinState;
    }

    public void setInsertCoinState(VendingMechineState insertCoinState) {
        this.insertCoinState = insertCoinState;
    }

    public VendingMechineState getSoldState() {
        return soldState;
    }

    public void setSoldState(VendingMechineState soldState) {
        this.soldState = soldState;
    }

    public VendingMechineState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(VendingMechineState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public VendingMechineState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(VendingMechineState winnerState) {
        this.winnerState = winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
