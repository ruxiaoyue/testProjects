package com.senthink.test;

import com.senthink.test.Class.Police;
import com.senthink.test.Class.Transpoter;
import com.senthink.test.Class.Guard;
import com.senthink.test.Class.Thief;

/**
 * Created by lenovo on 2017/11/7.
 * 观察者模式实例
 */
public class WeatherObserver {

    public static void main(String[] args) {
        /*//被观察者
        WeatherStation weatherStation = new WeatherStation();
        //观察者1
        ConditionDisplay conditionDisplay = new ConditionDisplay(weatherStation);
        //观察者2
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherStation);

        List<Float> forcastData = new ArrayList<>();
        forcastData.add(21.1f);
        forcastData.add(25.3f);
        forcastData.add(22.6f);

        weatherStation.setMessage("temp 25", forcastData);*/

        Transpoter transpoter = new Transpoter();
        Police police = new Police();
        Guard guard = new Guard();
        Thief thief = new Thief();

        transpoter.registWatcher(police);
        transpoter.registWatcher(guard);
        transpoter.registWatcher(thief);
        transpoter.noticeWatchers();
    }

}
