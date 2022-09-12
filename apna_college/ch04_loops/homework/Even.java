package apna_college.ch04_loops.homework;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            for(int i = 0; i<num;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}
