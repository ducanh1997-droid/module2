package arrayandfunction;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1:");
        int length1 = Integer.parseInt(scanner.nextLine());
        array1 = new int[length1];
        for(int i = 0;i<array1.length;i++){
            System.out.println("Nhập phần tử thứ: "+(i+1));
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("Nhập số lượng phần tử mảng 2:");
        int length2 = Integer.parseInt(scanner.nextLine());
        array2 = new int[length2];
        for(int i = 0;i<array2.length;i++){
            System.out.println("Nhập phần tử thứ: "+(i+1));
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        for(int i = 0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        int[] array3 = new int[array1.length+array2.length];
        for(int i = 0;i<array1.length;i++){
            array3[i] = array1[i];
        }
        for(int i = 0;i<array2.length;i++){
            array3[i+ array1.length] = array2[i];
        }
        System.out.println("Mảng gộp là:");
        for(int i = 0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }
    }
}
