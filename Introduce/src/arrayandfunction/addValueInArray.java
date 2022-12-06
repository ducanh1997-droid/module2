package arrayandfunction;

import java.util.Scanner;

public class addValueInArray {
    public static void main(String[] args) {
        int[] arrayAdd = {12,2,2,4,23,45,12,3,0,0};
        int[] newArray = new int[arrayAdd.length];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần Thêm");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vị trí phần tử cần Thêm");
        int index = Integer.parseInt(input.nextLine());
        for(int j = 0;j<index;j++ ){
            newArray[j] = arrayAdd[j];
        }
                for(int j = index+1;j<arrayAdd.length-1;j++ ){
                    newArray[j] = arrayAdd[j-1];
                }
        newArray[index] = x;
        for(int i = 0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
