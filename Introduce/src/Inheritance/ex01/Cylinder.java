package Inheritance.ex01;

public class Cylinder extends Circle{
    private double height = 2.0;

    public double getHeight() {
        return height;
    }

    public Cylinder(){

    }
    public Cylinder(double radius,String color,double height){
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
         return super.getArea()*this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder with " +
                "height=" + height +
                " and area of circle = "+ super.getArea()+
                " and Volume = "+getVolume();
    }
}
