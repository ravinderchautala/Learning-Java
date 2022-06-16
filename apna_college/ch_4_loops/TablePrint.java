package apna_college.ch_4_loops;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
            // int c = a*i;
            // System.out.printf("%d X %d = %d\n",a,i,c);
            System.out.println(a*i);
        }
    }
}
