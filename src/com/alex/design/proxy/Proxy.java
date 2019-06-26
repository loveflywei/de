package com.alex.design.proxy;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName Proxy.java
 * @Description 代理
 * @createTime 2019年06月26日 14:08:00
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();

    }

    public void preRequest(){
        System.out.println(" 访问真实主题前的处理 ……");
    }

    public void postRequest(){
        System.out.println(" 访问真实的主题后处理 ……");
    }


}
