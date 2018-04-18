package com.senthink.test;

import com.senthink.test.Class.AdminProxy;
import com.senthink.test.Service.Isubject;
import com.senthink.test.Service.impl.RealSubject;

/**
 * Created by hyacinth on 2018/1/24.
 */
public class SubjectTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Isubject isubject = new AdminProxy(realSubject);
        isubject.doSomething();
    }
}
