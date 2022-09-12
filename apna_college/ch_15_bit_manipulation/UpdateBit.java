package apna_college.ch_15_bit_manipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int n=5;
            int pos=1;
            int oper = sc.nextInt();
            int bitmask= 1<<pos;

            if(oper==1){
                // set
                int newNumber = bitmask | n;
                System.out.println(newNumber);
                }else{
                    int newBitMask = ~(bitmask);
                    int newNumber = newBitMask & n;
                    System.out.println(newNumber);
            }
        }
    }
}
