package search;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì");
        String n = scanner.nextLine();
        String max = "";
        String newString = String.valueOf(n.charAt(0));
        char a,b;
//        for(int i=1;i<n.length()-1;i++){
//            for(int j=1;j<n.length()-(i+1);j++){
//                for(int z=1;z<n.length()-1)
//                if(j==1){
//                     a = n.charAt(j-1);
//                     b = n.charAt(j+(i-1));
//                }else{
//                     a = n.charAt((j-1)+(i-1));
//                     b = n.charAt((j-1)+(i-1)+1);
//                }
//                if(a<b){
//                    newString+=b;
//                }
//            }
//            System.out.println(newString);
//            if(newString.length()>max.length()){
//                max = newString;
//            }
//            newString = String.valueOf(n.charAt(0));
//        }
        System.out.println(max);
    }
}
