package apna_college.ch07_functions_and_methods;
import java.util.*;
public class PrintName {
  public static void printName(String str){
        System.out.println("Your name is "+ str);
        return;
 }
   public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            printName(name);
        }
   }
}
