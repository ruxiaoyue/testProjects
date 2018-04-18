package com.senthink.test.decorate;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Created by lenovo on 2018/3/7.
 */
public class LoggerDecorate implements Logger{

    public Logger logger;

    public LoggerDecorate(Logger logger) {
        this.logger = logger;
    }

    public void warn(String message) {}
    public void warn(String me, Object o) {}
    public void warn(String me, Object... o) {}
    public void warn(Marker marker, String me) {}
    public void warn(String me, Object o, Object m) {}
    public void warn(Marker marker, String me, Object... o) {}
    public void warn(Marker marker, String me, Object o) {}
    public void warn(Marker marker, String me, Object o, Object o1) {}
    public void warn(Marker marker, String me, Throwable e) {}
    public void warn(String me, Throwable throwable) {}

    public void info(String info, Object o) {}
    public void info(String me) {}
    public void info(Marker marker, String message) {}
    public void info(String me, Object... o) {}
    public void info(String me, Throwable throwable) {}
    public void info(String me, Object o, Object m) {}
    public void info(Marker marker, String me, Throwable e) {}
    public void info(Marker marker, String me, Object o) {}
    public void info(Marker marker, String me, Object... o) {}
    public void info(Marker marker, String me, Object o1, Object o2) {}

    public void debug(String me) {}
    public void debug(String me, Object... o) {}
    public void debug(String message, Object o) {}
    public void debug(String me, Throwable e) {}
    public void debug(String me, Object o, Object m) {}
    public void debug(Marker marker, String message) {}
    public void debug(Marker marker, String me, Object o) {}
    public void debug(Marker marker, String me, Object... o) {}
    public void debug(Marker marker, String message, Throwable throwable) {}
    public void debug(Marker marker, String message, Object o, Object m) {}

    public void error(String message) {}
    public void error(String message, Object o) {}
    public void error(Marker marker, String me) {}
    public void error(String me, Object... o) {}
    public void error(String me, Object o, Object f) {}
    public void error(String message, Throwable throwable) {}
    public void error(Marker marker, String message, Object o) {}
    public void error(Marker marker, String message, Throwable e) {}
    public void error(Marker marker, String message, Object... argument) {}
    public void error(Marker marker,String message, Object o1, Object o2) {}

    public void trace(String me) {}
    public void trace(String me, Object o) {}
    public void trace(Marker marker, String e) {}
    public void trace(String me, Object... o) {}
    public void trace(String me, Throwable throwable) {}
    public void trace(String me, Object o, Object d1) {}
    public void trace(Marker marker, String me, Throwable throwable) {}
    public void trace(Marker marker, String me, Object o) {}
    public void trace(Marker marker, String me, Object... o) {}
    public void trace(Marker marker, String me, Object o, Object o1) {}

    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    public boolean isDebugEnabled(Marker marker) {
        return true;
    }

    public boolean isInfoEnabled(Marker marker) {
        return true;
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public boolean isInfoEnabled() {
        return true;
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public boolean isErrorEnabled(Marker marker) {
        return true;
    }

    public boolean isTraceEnabled(Marker marker) {
        return true;
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public String getName() {
        return "";
    }

}
