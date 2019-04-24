package com.alex.design.simplefactory;

/**
 * @Title: FactoryPatternDemo
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/2410:35
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangele = shapeFactory.getShape("rectangle");

        rectangele.draw();

        Shape square = shapeFactory.getShape("Square");

        square.draw();
    }
}
