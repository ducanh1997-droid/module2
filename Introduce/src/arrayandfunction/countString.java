package arrayandfunction;

import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        String str = "aaabcd";
        Scanner scanner = new Scanner(System.in);
        String charInString = scanner.nextLine();
        int count = 0;
        for( int i= 0;i<str.length();i++){
            String value = String.valueOf(str.charAt(i));
            if(value.equals(charInString)){
                count++;
            }
            
        }
        System.out.println("Số lượng ký tự "+ charInString+"trong chuỗi là:"+ count);
    }
}
