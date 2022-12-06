package arrayandfunction;

import java.util.Scanner;

public class sumInRow {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.println("Nhập phần tử: ["+i+"]["+j+"]");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Tính tổng các phần tử trong cột thứ:");
        int row = Integer.parseInt(scanner.nextLine());
        int sumRow = 0;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                if(j==(row-1)){
                   sumRow += matrix[i][row-1];
                }
            }
        }
        System.out.println("tổng cột "+row+" là: "+sumRow);
    }
}
