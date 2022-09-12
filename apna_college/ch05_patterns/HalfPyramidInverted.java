package apna_college.ch05_patterns;
import java.util.*;
public class HalfPyramidInverted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value:");
            int n = sc.nextInt();
            for(int i= n;i>=1;i--){
                for(int j = 1 ;j<=i;j++){
                    System.out.print("*");
                }System.out.println("");
            }
        }
    }
}
