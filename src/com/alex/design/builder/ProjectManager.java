package com.alex.design.builder;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName ProjectManager
 * @Description 项目经理
 * @createTime 2019年06月25日 15:34:00
 */
public class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder){
        this.builder = builder;
    }

    public Parlour decorate(){
        builder.buildWall();
        builder.buildTV();
        builder.builidSofa();
        return builder.getResult();
    }
}
