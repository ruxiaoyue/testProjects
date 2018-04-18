package com.senthink.test.thread;

/**
 * Created by lenovo on 2018/3/8.
 */
public class ThreadModle {

    public static void main(String[] args) {
        Station station = new Station("城战");
        Station station1 = new Station("东站");
        Station station2 = new Station("窗口");

        station.start();
        station1.start();
        station2.start();

        /*Bank bank = new Bank();

        Person person = new Person(bank);
        PersonB personB = new PersonB(bank);

        person.start();
        personB.start();*/

        /*Tortoise tortoise = new Tortoise();

        Rabbit rabbit = new Rabbit();

        StopOne stopOne = new StopOne(tortoise);
        tortoise.callToBack = stopOne;

        StopOne stopOne1 = new StopOne(rabbit);
        rabbit.callToBack = stopOne1;

        rabbit.start();
        tortoise.start();*/


    }
}
