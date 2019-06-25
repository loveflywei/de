package com.alex.design.builder;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName Decorator
 * @Description 装修工人
 * @createTime 2019年06月25日 11:36:00
 */
abstract class Decorator {
    protected Parlour product = new Parlour();

    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void builidSofa();

    public Parlour getResult(){
        return product;
    }
}
