package modifierStatic;

public class Circle {
   private static double radius = 1.0;
   private String color = "red";

   public Circle(){

   }
   public Circle(double radius){
      this.radius = radius;
   }

   public static double getRadius() {
      return radius;
   }

   protected static double getArea(){
      final double PI = 3.14;
      return PI*Math.pow(Circle.getRadius(),2);
   }
}
