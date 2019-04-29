package com.alex.design.simplefactory;

/**
 * @Title: ShapeFactory
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/2410:30
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangele = shapeFactory.getShape("rectangle");

        rectangele.draw();

        Shape square = shapeFactory.getShape("Square");

        square.draw();
    }
}
