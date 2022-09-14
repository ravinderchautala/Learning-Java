package apna_college.ch12_strings.homework;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();
        // substring method
        // System.out.println(email.substring(0,email.length()-10));
        String username ="";
        for(int i =0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username+=email.charAt(i);
            }
        }System.out.println(username);

    }
}
