package apna_college.ch15_bit_manipulation.homework;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("Enter a bit: ");
            int b = sc.nextInt();
            System.out.print("Enter position where you want to toggle: ");
            int pos = sc.nextInt();
            int bitMask = 1<<pos;
            int newNumber =0;
            if(b==0){
                int newBitMask = ~(bitMask);
                newNumber = newBitMask & n;
                System.out.println(newNumber);
            }else if(b==1){
                newNumber = bitMask | n;
                System.out.println(newNumber);
            }
        }
    }
}
