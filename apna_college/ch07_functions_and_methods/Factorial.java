package apna_college.ch07_functions_and_methods;
import java.util.*;
public class Factorial {
    public static void factorial(int a){
        if(a<0){
            System.out.println("Enter a valid number!!!");
            return;
        }
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
       factorial(a);
    }
}
