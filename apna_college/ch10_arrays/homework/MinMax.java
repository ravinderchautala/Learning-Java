package apna_college.ch10_arrays.homework;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,45,67,34,23,56};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }else if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);
    }
}
