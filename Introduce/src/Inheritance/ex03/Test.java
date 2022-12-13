package Inheritance.ex03;

public class Test {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint();
        point1.setXY(1,2);
        point1.setSpeed(1,1);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);
    }
}
