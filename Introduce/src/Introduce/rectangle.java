package Introduce;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int width = input.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int height = input.nextInt();
        System.out.println("Diện tích hình chữ nhật là:" +(width*height));

    }
}
