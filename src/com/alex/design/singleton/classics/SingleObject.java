package com.alex.design.singleton.classics;

/**
 * @Title: SingleObject
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/717:25
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world");
    }

}
