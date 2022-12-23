package Exception;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác:");
        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("c: ");
        int c = Integer.parseInt(scanner.nextLine());
        IllegalTriangleException triangle = new IllegalTriangleException();
        try{
            triangle.checkTriangle(a,b,c);

        } catch (IllegalTriangleException e) {
            System.out.println("ko phải tam giác");
            throw new RuntimeException(e);
        }

    }
    public void checkTriangle(int a, int b,int c) throws IllegalTriangleException{
            if((a>0 & b>0 & c>0) && a+b>c && a+c>b && b+c>a){
                System.out.println("đây là tam giác");
            }else{
                throw new IllegalTriangleException();
            }
    }
}
