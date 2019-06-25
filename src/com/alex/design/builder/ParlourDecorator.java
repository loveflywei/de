package com.alex.design.builder;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName ParlourDecorator
 * @Description 客厅装修
 * @createTime 2019年06月25日 15:38:00
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecrator1();
        ProjectManager projectManager = new ProjectManager(decorator);
        final Parlour decorate = projectManager.decorate();
        decorate.show();
    }
}
