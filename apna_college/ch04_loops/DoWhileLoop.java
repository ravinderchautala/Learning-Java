package apna_college.ch04_loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            int i=0;
            int sum = 0;
            do{
                sum = sum + i;
                i++;
            }while(i<=n);
            // for(int i=0;i<=n;i++){
            //     sum = sum + i;
            // }
            System.out.println(sum);
        }
    }
}
