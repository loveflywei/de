package com.alex.design.factorymethod;

/**
 * @Title: Rectangle
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/2816:21
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        Rectangle rectange = new Rectangle();
        return rectange;
    }
}
