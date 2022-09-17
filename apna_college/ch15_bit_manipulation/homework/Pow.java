package apna_college.ch15_bit_manipulation.homework;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        String str ="";
        str  = ((n%2==0) ? "0" : "1")+str;
        int b = Integer.parseInt(str);
        int pos = str.length();
        int bitMask = 1<<pos;
        int result = bitMask | b;
        System.out.println(result);
        // if(result%2==0){
        //     System.out.println("Number is power of 2.");
        // }else{
        //     System.out.println("Number is not a power of 2.");
        // }
    }
}
