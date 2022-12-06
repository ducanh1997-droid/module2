package loop;

import java.util.Scanner;

public class show20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for(int N=2;count<=number;N++){
            boolean flag = true;
            for(int i = 2;i<=Math.sqrt(N);i++){
                if(N%i == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(N);
                count++;
            }
        }
    }
}
