package apna_college.ch12_strings.homework;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number you want to add names: ");
            int size = sc.nextInt();
            int length = 0;
            String arr [] = new String[size];
            for(int i=0;i<size;i++){
                System.out.print("Enetr a name: ");
                arr[i] = sc.next();
                length+=arr[i].length();
            }System.out.println("The length of the tatol string is "+length);
        }
    }
}
