package apna_college.ch12_strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Your name is " + name);
        }
    }
}
