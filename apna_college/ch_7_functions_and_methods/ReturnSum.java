package apna_college.ch_7_functions_and_methods;
import java.util.Scanner;

public class ReturnSum {
    public static int sum(int a,int b){
    return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
       System.out.println(sum(a, b)); 
    }
}
