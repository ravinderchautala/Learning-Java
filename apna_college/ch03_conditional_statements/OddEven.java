package apna_college.ch03_conditional_statements;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
