package apna_college.ch_12_strings;

public class CharAtFuc {
    public static void main(String[] args) {
        
    String firstname="Ravinder";
        String lastname="Chautala";
        String fullname= firstname +" "+ lastname;
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
}
}
