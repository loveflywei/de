package com.alex.design.abstractfactorypattern;

/**
 * @Title: Rectangle
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3014:43
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
