package apna_college.ch05_patterns;
import java.util.*;
public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a value:");
        int n = sc.nextInt();
        for(int i=n; i>=0; i--){
            for(int j=1; j<=i;j++){
            System.out.print(j+" ");
        }System.out.println("");
    }
    }
}
