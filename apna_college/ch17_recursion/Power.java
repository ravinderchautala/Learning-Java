package apna_college.ch17_recursion;

import java.util.Scanner;

public class Power {
    static int res;
    public static int pow(int n,int x){
        if(x==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        // for space complexity = n;
        // return n*pow(n,x-1);
        
        //  for space complexity = logn
        if(x%2==0){
            res = pow(n, x/2)*pow(n, x/2);
        }else{
            res = n*pow(n, x/2)*pow(n, x/2);
        }
        return res;
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
