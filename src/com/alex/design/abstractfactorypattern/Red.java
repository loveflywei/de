package com.alex.design.abstractfactorypattern;

/**
 * @Title: Red
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/4/3014:59
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}
