package com.senthink.test.prototype;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Mail implements Cloneable{

    private String reciver;

    private String tail;

    private String context;

    private String subscribe;

    public Mail(MailTemp mailTemp) {
        this.subscribe = mailTemp.getSubscribe();
        this.context = mailTemp.getContext();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException{
        Mail mail = (Mail)super.clone();
        return mail;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }
}
