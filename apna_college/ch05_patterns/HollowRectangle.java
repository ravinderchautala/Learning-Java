package apna_college.ch05_patterns;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of rows:");
            int n=sc.nextInt();
            System.out.print("Enter the value of columns:");
            int m=sc.nextInt();
            for(int i =1;i<=n;i++){
                    for(int j =1; j<=m;j++){
                        if(j==m ||j==1||i==1||i==n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }System.out.println("");
            }
        }
    }
}
