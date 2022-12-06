package loop;

import java.util.Scanner;

public class showshapes {
    public static void main(String[] args) {
        int chose = -1;
        Scanner scanner = new Scanner(System.in);

        while(chose != 0 ){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            chose = scanner.nextInt();
            switch(chose){
                case 1:
                    for(int i = 0;i<3;i++){

                        for(int j = 0;j<7;j++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:

                    for(int i = 0;i<5;i++){
                        for(int j = 5;j>i+1;j--){
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for(int i = 1;i<=5;i++){
                        for(int z = 5;z>i;z--){
                            System.out.print(" ");
                        }
                        for(int j = 0;j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    chose = 0;
                    break;
                default:
                    System.out.println("no choice");
                    break;
            }
        }

    }
}
