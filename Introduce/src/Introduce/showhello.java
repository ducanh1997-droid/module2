package Introduce;

import java.util.Scanner;

public class showhello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Hello:"+ name);
    }
}
