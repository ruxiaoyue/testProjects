package com.senthink.test.designParttern.responsebility;

/**
 * Created by hyacinth on 2018/3/21.
 */
public abstract class IHandler {

    public final static int FL = 1;

    public final static int HL= 2;

    public final static int SL = 3;

    private int lever;

    private IHandler nextHandler;

    public IHandler(int lever) {
        this.lever = lever;
    }

    public void handlerMessage(WomanImpl woman) {
        if (woman.getType() == this.lever) {
            response(woman);
        }else {
            if (nextHandler != null) {
                this.nextHandler.handlerMessage(woman);
            }
        }
    }

    public void setNext(IHandler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(WomanImpl woman);


}
