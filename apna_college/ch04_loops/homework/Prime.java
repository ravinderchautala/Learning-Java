package apna_college.ch04_loops.homework;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            if(a>5){
            if(a%2==0 || a%3==0 || a%5==0){
                System.out.println("Not a Prime");
            }else{
                System.out.println("Number is Prime");
            }
   }else if(a<=5 && a>1){
            System.out.println("Number is Prime");
   }else{
            System.out.println("Enter a valid number");
   }
        }
    }
}
