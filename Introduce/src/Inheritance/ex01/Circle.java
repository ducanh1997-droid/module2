package Inheritance.ex01;

public class Circle {
    private double radius = 1.0;
    private String color="red";
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        final double PI = 3.14;
        return PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString(){
        return "A circle with radius: "+
                getRadius()+
                "and color: "+
                getColor();
    }
}
