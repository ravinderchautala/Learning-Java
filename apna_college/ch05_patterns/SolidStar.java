package apna_college.ch05_patterns;

import java.util.Scanner;

public class SolidStar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of rows:");
            int n=sc.nextInt();
            System.out.print("Enter the value of columns:");
            int m=sc.nextInt();
            for(int i = 0; i<n;i++){
                for(int j =0; j<m;j++){
                    System.out.print("* ");
                }System.out.println("");
            }
        }
        }
    }
