package com.senthink.test.Class.testClass;

/** check whether a number is a prime number
 * Created by hyacinth on 2018/2/7.
 */
public class PrimeNumberChecker {

    public Boolean checkerNumer(Integer num) {
        for (int i = 2; i < (num /2); i++) {
             if ((num % i) == 0) {
                 return false;
             }
        }
        return true;
    }
}
