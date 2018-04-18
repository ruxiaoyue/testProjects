package com.senthink.test.prototype.exampleTwo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by hyacinth on 2018/3/12.
 */
public class Sheep implements Cloneable{
    private String sex;
    private int age;
    private Date birthday;

    private Admin admin;

    private final static Logger LOGGER = LoggerFactory.getLogger(Sheep.class);

    public Sheep(String sex, int age, Admin admin, Date birthday) {
        this.admin = admin;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Sheep(String sex, int age, Date birthday) {
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep [age=" + age + ", sex=" + sex + ", admin=" + admin + "birthday" + birthday + "]";
    }

    public String toStringWithoutAdmin() {
        return "Sheep [age=" + age + ", sex=" + sex + ", birthday" + birthday + "]";
    }

    public Sheep startClone() throws CloneNotSupportedException{
        Sheep sheep = (Sheep) super.clone();
        //sheep.admin = this.admin.clone();
        sheep.birthday = (Date) this.birthday.clone();
        LOGGER.debug("sheep::{}", sheep.toString());
        return sheep;
    }
}
