package Inheritance.ex02;

public class TestPoint {
    public static void main(String[] args) {
        //Point2D
        Point2D point2d1 = new Point2D();
        Point2D point2d2 = new Point2D(10.0f,20.0f);

        System.out.println(point2d1);
        System.out.println(point2d2);
        point2d1.setXY(2.0f,3.0f);
        System.out.println(point2d1);
        //Point3D
        Point3D point3d1 = new Point3D();
        Point3D point3d2 = new Point3D(10.0f,20.0f,40.0f);
        System.out.println(point3d1);
        System.out.println(point3d2);

        point3d1.setXYZ(2.0f,3.0f,3.0f);
        System.out.println(point3d1);
    }
}
