package arrayandfunction;

import java.util.Scanner;

public class sumDiagonalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.println("Nhập phần tử: ["+i+"]["+j+"]");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sumDiagonal = 0;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                if(i == j){
                    sumDiagonal+= matrix[i][j];
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Tổng của đường chéo ma trận vuông là:"+sumDiagonal);

    }
}
