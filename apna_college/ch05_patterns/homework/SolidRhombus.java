package apna_college.ch05_patterns.homework;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. ");
            int n = sc.nextInt();
            for(int i = 0; i<n;i++){
                for(int j = n-i; j>0;j--){
                    System.out.print(" ");
                }
                for(int j = 0;j<n;j++){
                    System.out.print("*");
                }System.out.println();
            }
        }
    }
}
