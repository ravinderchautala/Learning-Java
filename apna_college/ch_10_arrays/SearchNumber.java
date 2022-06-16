package apna_college.ch_10_arrays;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int numbers[]=new int [size];
        System.out.print("Enter a number to find: ");
        int x= sc.nextInt();
        for(int i=0;i<size; i++){
            numbers[i]= sc.nextInt();
            
        }for(int i=0;i<size; i++){
            if(numbers[i]==x){
                System.out.println("X find at index no."+ i);
            }
        }
        
    }
}
