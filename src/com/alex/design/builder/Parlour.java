package com.alex.design.builder;

/**
 * @author jiangwei121
 * @version 1.0.0
 * @ClassName Parlour
 * @Description 客厅
 * @createTime 2019年06月25日 11:32:00
 */
public class Parlour {
    private String wall;
    private String TV;
    private String sofa;


    public void show(){
        System.out.println(wall);
        System.out.println(TV);
        System.out.println(sofa);
    }




    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
}
