package com.senthink.test.Class;

import com.senthink.test.Service.Observer;
import com.senthink.test.Service.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyacinth on 2017/11/7.
 */
public class WeatherStation implements Subject {

    private List<Observer> observers;

    private String message;

    private List<Float> forcastDisplay;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void notifyObservables() {
        for (Observer observer:observers) {
            observer.updateT();
        }
    }

    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void setMessage(String message, List<Float> forcastDisplay) {
        this.message = message;
        this.forcastDisplay = forcastDisplay;
        notifyObservables();
    }

    public String getContent() {
        return this.message;
    }

    public List<Float> getForcastDisplay() {
        return this.forcastDisplay;
    }
}
