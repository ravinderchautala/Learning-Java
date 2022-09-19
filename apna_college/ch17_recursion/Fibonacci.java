package apna_college.ch17_recursion;

public class Fibonacci {
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        fibo(b, c, n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int a =0,b=1;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n-2);
    }
}
