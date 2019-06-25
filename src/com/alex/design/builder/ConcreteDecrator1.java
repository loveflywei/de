package com.alex.design.builder;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName ConcreteDecrator1
 * @Description 建造者
 * @createTime 2019年06月25日 14:09:00
 */
public class ConcreteDecrator1 extends Decorator{
    @Override
    public void buildWall() {
        product.setWall(" this is white wall");
    }

    @Override
    public void buildTV() {
        product.setTV(" this is 44 white TV");
    }

    @Override
    public void builidSofa() {
        product.setSofa(" this is white sofa");
    }
}
