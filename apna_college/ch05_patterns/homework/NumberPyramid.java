package apna_college.ch05_patterns.homework;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                for(int j =1;j<=n-i;j++){
                    System.out.print(" ");
                }for(int j = i;j>0;j--){
                    System.out.print(j);
                }for(int j = 2;j<=i;j++){
                        System.out.print(j);
                    }
                System.out.println();
            }
        }
    }
}
