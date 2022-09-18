package apna_college.ch15_bit_manipulation.homework;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to convert: ");
                int n = sc.nextInt();
                String str ="";
                    while(n>0){
                        str  = ((n%2==0) ? "0" : "1")+str;
                        n= n/2;
                    }
                    System.out.println(str);
                    int d = 0;
                    for(int i=str.length()-1;i>=0;i--){
                        if(str.charAt(i)=='0'){
                            d+=0;
                        }else if(str.charAt(i)=='1'){
                            d+=Math.pow(2,i);
                        }
                    }
                    System.out.println(d);
        }
    }
}
