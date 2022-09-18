package apna_college.ch17_recursion;

public class PrintNumber {
    public static void printNum(int n){
        if(n>0){
            System.out.println(n);
            printNum(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n =5;
        printNum(n);
    }
}
