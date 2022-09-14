package apna_college.ch10_arrays.homework;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter how much names you want to add: ");
            int size = sc.nextInt();
            String names[] = new String[size];
            for(int i = 0; i<size;i++){
                System.out.print("Enter a name: ");
                String name = sc.next();
                names[i]= name;
            }
            for(int i =0;i<size;i++){
                System.out.println(names[i]);
            }
        }
    }
}
