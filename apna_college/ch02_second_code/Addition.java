package apna_college.ch02_second_code;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println( "The addition of two numbers is: " + sum );
        }
    }
}
