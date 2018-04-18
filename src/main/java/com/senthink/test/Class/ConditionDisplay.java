package com.senthink.test.Class;

import com.senthink.test.Service.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.DisplayElement;

/**
 * Created by lenovo on 2017/11/7.
 */
public class ConditionDisplay implements Observer, DisplayElement{

    private WeatherStation weatherStation;

    private String message;

    private final static Logger LOGGER = LoggerFactory.getLogger(ConditionDisplay.class);

    public ConditionDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registObserver(this);
    }

    public void updateT() {
       this.message = weatherStation.getContent();
       display();
    }

    public void display() {
        LOGGER.debug("active message={}", message);
    }
}
