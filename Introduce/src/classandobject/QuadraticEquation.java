package classandobject;

import java.util.Scanner;

public class QuadraticEquation {
    final private double a;
    final private double b;
    final private double c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(this.getB(),2)-4*this.a*this.getC();
    }
    public double getRoot1(){
        return (-this.b-Math.sqrt(this.getDiscriminant()))/2*this.a;
    }
    public double getRoot2(){
        return (-this.b+Math.sqrt(this.getDiscriminant()))/2*this.a;
    }
    public double onlyRoot(){
        return -this.b/(2*this.getA());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number c:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Delta = "+quadraticEquation.getDiscriminant());
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has 2 roots \nx1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has only one roots:\nx= "+quadraticEquation.onlyRoot());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
