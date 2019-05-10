package com.alex.design.abstractfactory;

/**
 * @Title: ShapeFactory
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3015:06
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
