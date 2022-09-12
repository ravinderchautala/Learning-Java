package apna_college.ch05_patterns.homework;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print("  ");
            }for(int j = 0;j<i;j++){
                System.out.print(" "+ (i-j));
            }if(i>=2){
                for(int j = 2;j<=i;j++){
                    System.out.print(" "+j);
                }
            }
            System.out.println();
        }
    }
}
