package apna_college.ch03_conditional_statements.homework;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number:");
    int a = sc.nextInt();
    System.out.print("Enter second number:");
    int b = sc.nextInt();
    System.out.println("Choose a method from +, -, *, /, %");
    String str = sc.next();
    switch(str){
        case "+": System.out.println(a+b);
        break;
        case "-": System.out.println(a-b);
        break;
        case "*": System.out.println(a*b);
        break;
        case "/": System.out.println(a/b);
        break;
        case "%": System.out.println(a%b);
        break;
        default: System.out.println("Enetr a valid operation");
    }
}
}
