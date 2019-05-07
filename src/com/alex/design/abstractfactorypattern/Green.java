package com.alex.design.abstractfactorypattern;

/**
 * @Title: Green
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3015:00
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("fill green");
    }
}
