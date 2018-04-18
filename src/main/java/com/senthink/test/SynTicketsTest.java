package com.senthink.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Class.Ticket;

import java.util.ArrayList;

/**
 * Created by hyacinth on 2017/12/27.
 */
public class SynTicketsTest {

    /**
     * 车票库
     */
    public static ArrayList<Ticket> mTicketList = new ArrayList<>();

    private final static Logger LOGGER = LoggerFactory.getLogger(SynTicketsTest.class);

    public static void main(String[] args) {

        Test t = new Test();
        Thread thread = new Thread(t, "heli");
        Thread thread1 = new Thread(t, "mh");
        thread.start();
        thread1.start();
        /*SecureRandom random = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            Ticket ticket = new Ticket();
            int num = random.nextInt();
            ticket.ticketNum = num;
            mTicketList.add(ticket);
        }

        Passenger passenger = new Passenger("judy");
        passenger.start();
        Passenger passenger1 = new Passenger("hanmei");
        passenger1.start();*/

        /*for (int i = 0; i < 10; i++) {
            try{
                LOGGER.debug("join i={}", passengers[i].name);
                passengers[i].join();
                LOGGER.debug("passenger join::{}", i);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        /*for (int i = 0; i < passengers.length; i++) {
            LOGGER.debug(passengers[i].name + "抢到de票");
            int tCnt = 0;
            for (int j = 0; j < mTicketList.size(); j++) {
                Ticket ticket = mTicketList.get(j);

                if (ticket != null && ticket.owner != null && passengers[i] != null) {
                    if (ticket.owner.equalsIgnoreCase(passengers[i].name)) {
                        tCnt++;
                    LOGGER.debug(passengers[i].name + "抢到的 票编号ticket num ={}", ticket.ticketNum);
                    }
                }else {
                    LOGGER.debug("i={}, passenger{} 没有抢到票号={}", i,passengers[i].name, ticket.ticketNum);
                }
                LOGGER.debug(passengers[i].name + "总共抢到的票数为{}", tCnt);
            }
        }*/
    }
}
