import java.util.HashSet;

public class UniqueSubs {
    public static void subsequences(String str,int index, String str2,HashSet<String> set){
        if(index==str.length()){
            if((set.contains(str2))){
                
                return;
            }else{
                System.out.println(str2);
                set.add(str2);
                return;
            }
        }
        char c = str.charAt(index);
        subsequences(str, index+1, str2+c,set);
        subsequences(str, index+1, str2,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
