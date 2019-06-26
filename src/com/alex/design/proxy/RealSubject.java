package com.alex.design.proxy;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName RealSubject.java
 * @Description Real Subject
 * @createTime 2019年06月26日 11:35:00
 */
public class RealSubject implements Subject
{
    @Override
    public void request() {
        System.out.println("访问真实主题方法……");
    }
}
