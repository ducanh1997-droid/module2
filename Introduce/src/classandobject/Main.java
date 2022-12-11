package classandobject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the height:");
        int height = Integer.parseInt(scanner.nextLine());
        ClassRectangle rectangle = new ClassRectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());
    }
}
