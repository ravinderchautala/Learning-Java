package apna_college.ch17_recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int n,int x){
        if(x==0){
            return 1;
        }
        return n*pow(n,x-1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number ");
            int n= sc.nextInt();
            System.out.print("Enter power ");
            int x = sc.nextInt();
            int result = pow(n,x);
            System.out.println(result);
        }
    }
}
