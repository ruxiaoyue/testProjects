package com.senthink.test.Class;

import com.senthink.test.SynTicketsTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2017/12/27.
 */
public class Passenger extends Thread{

    public static String name;

    private int myTickets = 0;

    private int total = SynTicketsTest.mTicketList.size();



    private final static Logger LOGGER = LoggerFactory.getLogger(Passenger.class);

    public Passenger(String name) {
        this.name = name;
    }

    public void run() {

        if (myTickets < 3 && total > 0) {
            int size = SynTicketsTest.mTicketList.size();
            LOGGER.debug(this.name + "find::票库 total ticket num::{}", size);
            for (int i = 0; i < size; i++) {
                Ticket ticket = SynTicketsTest.mTicketList.get(i);
                synchronized (ticket) {
                    LOGGER.debug("passenger {}, ticket::{}", this.name, ticket.status);
                    if(ticket.status == Ticket.NOT_SOLD_STATE) {
                        ticket.setStatus(Ticket.SOLD_STATE);
                        ticket.setOwner(this.name);
                        myTickets += 1;
                        LOGGER.debug(this.name + "抢到" + ticket.ticketNum + "票号");
                        LOGGER.debug("myTickets={}", myTickets);
                        total--;
                        LOGGER.debug("total={}", total);
                        //break;
                    }else {
                        myTickets = 5;
                        LOGGER.debug("total={}, mytickets={}", total, myTickets);
                        continue;
                    }
                }
            }
        }

        try{
            sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
