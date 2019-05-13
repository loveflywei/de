package com.alex.design.singleton.lazy.thread.notsafe;

/**
 * @Title: Singleton
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/1314:39
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
