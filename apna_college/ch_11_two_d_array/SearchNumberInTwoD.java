package apna_college.ch_11_two_d_array;

import java.util.Scanner;

public class SearchNumberInTwoD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();
        System.out.print("Enter a number to search:");
        int x= sc.nextInt();
        int[][] numbers= new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("X is at index no." +"(" + i +"," + j+ ")");
                }
            }
        }
    }
}
