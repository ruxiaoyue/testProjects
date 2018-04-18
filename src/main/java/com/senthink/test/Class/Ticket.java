package com.senthink.test.Class;

/**
 * Created by hyacinth on 2017/12/27.
 */
public class Ticket {

    public static boolean SOLD_STATE = true;

    public static boolean NOT_SOLD_STATE = false;

    /**
     * 票号
     */
    public int ticketNum = 0;

    /**
     * 车票拥有者
     */
    public String owner = null;

    /**
     * 车票状态
     */
    public boolean status = NOT_SOLD_STATE;

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
