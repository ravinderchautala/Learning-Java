package apna_college.ch04_loops.homework;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            do{
            System.out.print("Enter 1 or 0 for adding marks: ");
            a = sc.nextInt();
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();
                if(marks>=90){
                    System.out.println("This is Good");
                }else if(marks>=60 && marks<=89){
                    System.out.println("This is also Good");
                }else if(marks>=59 && marks>=0){
                    System.out.println("This is Good as well ");
                }
            }while(a==1);
        }
    }

}
