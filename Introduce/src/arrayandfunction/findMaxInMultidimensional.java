package arrayandfunction;

import java.util.Scanner;

public class findMaxInMultidimensional {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.println("Nhập phần tử: ["+i+"]["+j+"]");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = matrix[0][0];
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                if(max <matrix[i][j]){
                    max = matrix[i][j];
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Max là:"+max);
    }
}
