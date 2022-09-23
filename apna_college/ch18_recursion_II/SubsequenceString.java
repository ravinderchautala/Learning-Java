public class SubsequenceString {
    public static void subsequences(String str,int index, String str2){
        if(index==str.length()){
            System.out.println(str2);
            return;
        }
        char c = str.charAt(index);
        subsequences(str, index+1, str2+c);
        subsequences(str, index+1, str2);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
