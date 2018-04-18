package com.senthink.test.designParttern.pk.pk1.buildPk1;

/**
 * Created by lenovo on 2018/4/11.
 */
public abstract class BuilderPk1 {

    protected final Superman superman = new Superman();

    public void setBody(String body) {
        this.superman.setBody(body);
    }

    public void setSpecialTalent(String st) {
        this.superman.setSpecialTalent(st);
    }

    public void setSpecialSymbol(String ss){
        this.superman.setSpecialSymbol(ss);
    }

    public abstract Superman getSuperman();


}
