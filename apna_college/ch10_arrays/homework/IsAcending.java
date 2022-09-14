package apna_college.ch10_arrays.homework;

import java.util.Scanner;

public class IsAcending {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number you want to add: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
        {
           
            arr[i] =  sc.nextInt();
        }
        boolean isAcending = true;
        for(int i =0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isAcending = false;
            }
        }
        if(isAcending){
            System.out.println("Order is Acending");
        }else{
            System.out.println("Order is not Acending");
        }
    }
}
