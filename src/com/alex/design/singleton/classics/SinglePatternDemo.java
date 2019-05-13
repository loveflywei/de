package com.alex.design.singleton.classics;

/**
 * @Title: SinglePatternDemo
 * @ProjectName design-model
 * @Description: TODO
 * @Author jiangwei121
 * @Date 2019/5/1314:19
 */
public class SinglePatternDemo {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
