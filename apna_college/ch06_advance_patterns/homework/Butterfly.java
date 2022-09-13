package apna_college.ch06_advance_patterns.homework;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enetr a value: ");
        int n = sc.nextInt();
        // upper half
        for(int i =1;i<=n;i++){
            // left-side *
            for(int j = 1; j<=i;j++){
                if(i==1||i==j||j==1){
                    System.out.print("*");}else{
                System.out.print(" ");
                    }
            }
            // spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // right-side *
            for(int j = 1; j<=i;j++){
            if(i==1||i==j||j==1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }System.out.println();
        }

        // lower half
        for(int i =n;i>=1;i--){
            // left-side *
            for(int j = 1; j<=i;j++){
                if(i==1||i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // right-side *
            for(int j = 1; j<=i;j++){
                if(i==1||i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    }
}
