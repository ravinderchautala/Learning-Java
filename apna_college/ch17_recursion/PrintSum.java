package apna_college.ch17_recursion;

public class PrintSum {
    static int sum = 0;
    public static int printSum(int n){
        if(n>0){
            sum+=n;
            printSum(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(printSum(n));
        // printSum(n);
    }
}
