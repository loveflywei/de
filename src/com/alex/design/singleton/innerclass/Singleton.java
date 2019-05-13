package com.alex.design.singleton.innerclass;

/**
 * @Title: Singleton
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/1317:47
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
