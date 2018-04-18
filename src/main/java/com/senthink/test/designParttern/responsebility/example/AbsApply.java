package com.senthink.test.designParttern.responsebility.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018/3/21.
 */
public abstract class AbsApply {

    public final static int PO = 500;

    public final static int DT = 1000;

    public final static int GT = 2000;

    private int level;

    private AbsApply netHandler;

    private final static Logger LOGGER = LoggerFactory.getLogger(AbsApply.class);

    public AbsApply(int level) {
        this.level = level;
    }

    public void applyHandler(StaffAbs staffAbs) {
        LOGGER.debug("level ={}, staff number ={}", this.level, staffAbs.getNumber());
        if (staffAbs.getNumber() < this.level) {
            this.response(staffAbs);
        }else {
            LOGGER.debug("set next");
            if (this.netHandler != null) {
                netHandler.applyHandler(staffAbs);
            }
        }
    }

    public void setNext(AbsApply absApply){
        this.netHandler = absApply;
    }

    abstract void response(StaffAbs staffAbs);


}
