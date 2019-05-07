package com.alex.design.abstractfactorypattern;

/**
 * @Title: AbstractFactory
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3015:04
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
