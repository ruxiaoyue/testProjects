package com.senthink.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Class.VendingMechineUpdate;

/**
 * Created by hyacinth on 2017/11/27.
 */
public class VendingMeshineTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(VendingMeshineTest.class);

    public static void main(String[] args) {
        //the first example
        /*VendingMechine vendingMechine = new VendingMechine(10);
        vendingMechine.insertCoin();
        vendingMechine.trunCrank();
        LOGGER.debug("first ~~~~~~~~~~~");

        vendingMechine.insertCoin();
        vendingMechine.returnCoin();
        LOGGER.debug("second ~~~~~~~~~~");

        vendingMechine.insertCoin();
        vendingMechine.insertCoin();
        vendingMechine.insertCoin();
        vendingMechine.trunCrank();
        vendingMechine.trunCrank();
        vendingMechine.returnCoin();
        vendingMechine.trunCrank();*/

        //the update example
        VendingMechineUpdate machine = new VendingMechineUpdate(10);
        machine.insertCoin();
        machine.backMoney();

        System.out.println("----我要中奖----");

        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();
        machine.insertCoin();
        machine.turnCruak();

        System.out.println("-------压力测试------");

        machine.insertCoin();
        machine.backMoney();
        machine.backMoney();
        machine.turnCruak();// 无效操作
        machine.turnCruak();// 无效操作
        machine.backMoney();

    }
}
