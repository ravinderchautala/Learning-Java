package apna_college.ch19_recursion_III;


public class StringPermutation {
    public static void strPer(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            strPer(newstr, perm+c);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        strPer(str, "");
    }
}
