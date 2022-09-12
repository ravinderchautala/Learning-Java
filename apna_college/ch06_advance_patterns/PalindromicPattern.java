package apna_college.ch06_advance_patterns;

import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                // spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // first half
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                // second half
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
}
