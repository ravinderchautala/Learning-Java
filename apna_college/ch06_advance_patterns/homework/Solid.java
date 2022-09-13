package apna_college.ch06_advance_patterns.homework;

import java.util.Scanner;

public class Solid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                // spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // Stars
                for(int j=1; j<=n;j++){
                    if(i==1||j==1||i==n||j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
               System.out.println(" ");
            }
        }
    }
    
}
