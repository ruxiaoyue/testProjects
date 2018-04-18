package com.senthink.test.prototype.exampleTwo;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Admin implements Cloneable{

    private String sex;
    private int age;

    public Admin(String sex, int age) {
        this.age = age;
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Admin [age=" + age + ", sex=" + sex + "]";
    }

    @Override
    public Admin clone() throws CloneNotSupportedException{
        Admin admin = (Admin) super.clone();
        return admin;
    }
}
