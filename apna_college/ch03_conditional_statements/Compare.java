package apna_college.ch03_conditional_statements;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:");
            int a = sc.nextInt();
            System.out.print("Enter second number:");
            int b = sc.nextInt();
            if(a==b){
                System.out.println("Both the numbers are equal.");
            }else if(a<b){
                System.out.println("Fisrt number is lesser.");
            }else{
                System.out.println("First number is greater.");
            }
        }
    }
}
