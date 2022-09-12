package apna_college.ch05_patterns.homework;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                for(int j = n-i; j>=0;j--){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i;j++){
                    System.out.print(i+" ");
                }System.out.println("");
            }
        }
    }
}
