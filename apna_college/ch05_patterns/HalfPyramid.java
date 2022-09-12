package apna_college.ch05_patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value:");
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                for(int j = 0 ;j<i;j++){
                    System.out.print("*");
                }System.out.println("");
            }
        }
}
}
