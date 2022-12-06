package Introduce;
import java.util.Scanner;
public class readNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int num = number/100;
        int surplus = number%10;
        int surplus2 = (number/10)%10;
        if(number<=10 && number>0){
            checkNumber(number);
        }else if(number<20){
            checkNumber1(surplus);
        }else if(number<100){
            int numDozens = number/10;
            checkDozens(numDozens);
            checkNumber(surplus);
        }else if(number<1000){
            if(surplus2 == 0){
                checkNumber(num);
                if(surplus == 0){
                    System.out.print("hundred");
                }else{
                    System.out.print("hundred and ");
                    checkNumber(surplus);
                }
            }else if(surplus2 == 1){
                checkNumber(num);
                System.out.print("hundred and ");
                checkNumber1(surplus);
            }else{
                checkNumber(num);
                System.out.print("hundred and ");
                checkDozens(surplus2);
                checkNumber(surplus);
            }
        }
    }
    static void checkNumber1(int number){
        switch (number) {
            case 1 -> System.out.println("eleven");
            case 2 -> System.out.println("twelve");
            case 3, 4, 6, 7, 8, 9 -> {
                checkNumber(number);
                System.out.println("teen");
            }
            case 5 -> System.out.println("fifteen");
        }
    }
    static void checkNumber(int number){
        switch (number) {
            case 0 -> System.out.println(" ");
            case 1 -> System.out.print("one");
            case 2 -> System.out.print("two");
            case 3 -> System.out.print("three");
            case 4 -> System.out.print("four");
            case 5 -> System.out.print("five");
            case 6 -> System.out.print("six");
            case 7 -> System.out.print("seven");
            case 8 -> System.out.print("eight");
            case 9 -> System.out.print("nine");
            case 10 -> System.out.print("ten");
            default -> System.out.print(" out of ability");
        }
    }
    static void checkDozens(int num){
        switch (num) {
            case 2 -> System.out.print("twenty");
            case 3 -> System.out.print("thirty");
            case 4 -> System.out.print("forty");
            case 5 -> System.out.print("fifty");
            case 6 -> System.out.print("sixty");
            case 7 -> System.out.print("seventy");
            case 8 -> System.out.print("eighty");
            case 9 -> System.out.print("ninety");
        }
    }
}
