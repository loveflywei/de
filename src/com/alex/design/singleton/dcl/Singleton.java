package com.alex.design.singleton.dcl;

/**
 * @Title: Singleton
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/1316:25
 */
public class Singleton {
    private volatile static Singleton singletion;
    private Singleton(){}
    public static Singleton getSingletion(){
        if(singletion == null){
            synchronized(Singleton.class){
                if(singletion == null){
                    singletion = new Singleton();
                }
            }
        }
        return singletion;
    }

}
