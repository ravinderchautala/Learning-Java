package apna_college.ch12_strings;


public class Compare {
    public static void main(String[] args) {
       String name1="Ravinder";
        String name2="Vinita";

        // We use this for exact answer
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        // }

        // Not give an exact value
        // if(name1==name2){
        //     System.out.println("Strings are equal.");
        // }else{
        //     System.out.println("Strings are not equal.");
        // }

        // Below code give -ve result
        if(new String("Ravi")==new String("Ravi")){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }
    }
}