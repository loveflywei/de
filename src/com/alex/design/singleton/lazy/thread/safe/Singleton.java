package com.alex.design.singleton.lazy.thread.safe;

/**
 * @Title: Singleton
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/1314:50
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
