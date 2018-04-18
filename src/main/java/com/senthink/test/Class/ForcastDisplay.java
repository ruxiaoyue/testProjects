package com.senthink.test.Class;

import com.senthink.test.Service.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.senthink.test.Service.DisplayElement;

import java.util.List;

/**
 * Created by lenovo on 2017/11/16.
 */
public class ForcastDisplay implements Observer, DisplayElement{

    private List<Observer> observers;

    private WeatherStation weatherStation;

    private List<Float> forcastDisplay;

    private final static Logger LOGGER = LoggerFactory.getLogger(ForcastDisplay.class);

    public ForcastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registObserver(this);
    }

    public void updateT() {
        this.forcastDisplay = weatherStation.getForcastDisplay();
        display();
    }

    public void display() {
        for (int i = 0; i < forcastDisplay.size(); i++) {
            LOGGER.debug("未来第{}天的温度为{}", i, forcastDisplay.get(i));
        }

    }
}
