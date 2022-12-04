package Introduce;

import java.util.Scanner;

public class simpleEquation {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
//        String leftAlignFormat = "| %-15s | %-4d |%n";
//        System.out.format("+-----------------+------+%n");
//        System.out.format("| Column name     | ID   |%n");
//        System.out.format("+-----------------+------+%n");
//        for (int i = 0; i < 5; i++) {
//            System.out.format(leftAlignFormat, "some data" + i, i * i);
//        }
//        System.out.format("+-----------------+------+%n");
////        System.out.printf("%-20s%s", "Elements in array: ", "");
//        System.out.println(onCircle(1, 2, 3, 4, 5));
//
//        drawCircle(1, 3, 3, '*');
//        drawCircle(3, 3, 3, '*');
//        drawCircle(5, 10, 12, '*');


//    public static boolean onCircle(int radius, int cx, int cy, int x, int y) {
//        //default answer is false, but if the
//        //inequality holds then it is set to true
//        boolean isDrawn = false;
//        if (Math.pow(radius,2)<=(Math.pow((x-cx),2)+Math.pow((y-cy),2))
//                && (Math.pow((x-cx),2)+Math.pow((y-cy),2))<=(Math.pow(radius,2)+1)) {
//            isDrawn = true;
//        }
//        return isDrawn;
//    }
//
//    //Question 1B
//    public static void verifyInput(int radius, int cx, int cy) {
//        //if radius is negative, display error message
//        if (radius <= 0) {
//            throw new IllegalArgumentException(
//                    "The radius of the circle must be a positive number.");
//        }
//        //if the center of the circle with radius 'radius' causes the circle
//        //to 'overflow' into other quadrants, display error message
//        if ((cx - radius) < 0 || (cy - radius) < 0) {
//            throw new IllegalArgumentException(
//                    "the circle with requested parameters does not fit " +
//                            "in the quadrant. Consider moving the center of the " +
//                            "circle further from the axes.");
//        }
//    }
//
//    //Question 1C
//    public static void drawCircle(int radius, int cx, int cy, char symbol) {
//        verifyInput(radius, cx, cy);
//        //set the values for extension of the axes (aka how long are they)
//        int xMax = cx + radius + 1;
//        int yMax = cy + radius + 1;
//        for (int j = yMax; j >= 0; j--) {
//            for (int i = 0; i <= xMax; i++) {
//                //set of if-block to print the axes
//                if (i == 0 && j == 0) {
//                    System.out.print('+');
//                } else if (i == 0) {
//                    if (j == yMax) {
//                        System.out.print('^');
//                    }
//                    if (j != yMax && onCircle(radius, cx, cy, i, j) == false) {
//                        System.out.print('|');
//                    }
//                } else if (j == 0) {
//                    if (i == xMax) {
//                        System.out.print('>');
//                    }
//                    if (i != xMax && onCircle(radius, cx, cy, i, j) == false) {
//                        System.out.print('-');
//                    }
//                }
//
//                //if block to print the circle
//                //verify for each coordinate (i,j)
//                //in the quadrant if they are on circle
//                //if =true print symbol, if =false print empty character
//                if (onCircle(radius, cx, cy, i, j) == true) {
//                    System.out.print(symbol);
//                } else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }
//    }
    }
}