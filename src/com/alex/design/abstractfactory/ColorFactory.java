package com.alex.design.abstractfactory;

/**
 * @Title: ColorFactory
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3015:12
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BULE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
