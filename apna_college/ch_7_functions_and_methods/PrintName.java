package apna_college.ch_7_functions_and_methods;
import java.util.*;
public class PrintName {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);
    }
}
