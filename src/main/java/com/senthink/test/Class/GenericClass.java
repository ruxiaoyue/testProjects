package com.senthink.test.Class;

/**generic class definition
 * Created by hyacinth on 2017/12/26.
 */
public class GenericClass<T> {

    T file;

    private T key;

    public GenericClass(T key) {
       this.key = key;
    }

    public <T> T showKeyName(GenericClass<T> container) {
        T test = container.getKey();
        return test;
    }

    public T getKey() { return key;}

    public T getFile() {
        return file;
    }

    public void setFile(T file) {
        this.file = file;
    }


    /*public T out() {

    }*/
}
