package apna_college.ch18_recursion_II;

public class OccString {
    static int first =-1;
    static int last = -1;
    public static void Occ(String str, int index,char a){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(index);
        if(a==current){
            if(first==-1){
                first = index;
            }else{
                last = index;
            }
        }
        Occ(str, index+1, a);
    }
    public static void main(String[] args) {
        String str = "ravindervinita";
        Occ(str, 0, 'v');
    }
}
