package Inheritance.ex01;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0,"blue");

        System.out.println(circle1);
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(20,"green",20);

        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
