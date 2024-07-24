package org.example;

public class Wall {
    double height;
    double width;
    public Wall(double width,double height){
        this.height=height;
        this.width=width;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double customWidth){
        if(customWidth<0){
            width=0;
        }else{
            width=customWidth;
        }

    }
    public void setHeight(double customHeight){
        if(customHeight<0){
           height=0;
        }else{
            height=customHeight;
        }

    }
    public double getArea(){
        return height*width;
    }
}
