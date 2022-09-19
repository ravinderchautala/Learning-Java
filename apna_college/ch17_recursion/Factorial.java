package apna_college.ch17_recursion;

public class Factorial {
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        int fac = n*fac(n-1);
        return fac;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fac(n)); 
    }
}
