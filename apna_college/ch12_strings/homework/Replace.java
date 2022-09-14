package apna_college.ch12_strings.homework;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String s = "";
   for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                s+='i';
            }else{
                s+=str.charAt(i);
            }
   }System.out.println("Your updated string is "+ s);
        }
    }
    
}
