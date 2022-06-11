package ch_3_conditional_statements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You're not adult.");
        }else{
            System.out.println("You're adult");
        }
    }
}
