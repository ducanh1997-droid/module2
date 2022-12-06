package Introduce;

import java.util.Scanner;

public class transfermoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập USD:");
        int usd = input.nextInt();
        System.out.println("VND: "+ usd*24000+" vnd");
    }
}
