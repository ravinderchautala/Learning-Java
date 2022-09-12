package apna_college.ch05_patterns;
import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value:");
            int n = sc.nextInt();
           for(int i =1;i<=n;i++){
            for(int j= n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k =1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    }
}
