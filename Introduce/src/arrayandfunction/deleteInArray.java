package arrayandfunction;

import java.util.Scanner;

public class deleteInArray {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,4,23,45,12,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xoá");
        int x = Integer.parseInt(scanner.nextLine());
        int indexDel;
        for(int i = 0; i< arrayInt.length;i++){
            if(x == arrayInt[i]){
                indexDel = i;
                for(int j = indexDel;j<arrayInt.length-1;j++ ){
                    arrayInt[j] = arrayInt[j+1];
                }
            }
        }
        for(int i = 0;i<arrayInt.length;i++){
            System.out.print(arrayInt[i]+" ");
        }


    }
}
