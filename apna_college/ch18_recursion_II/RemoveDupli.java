public class RemoveDupli {

    public static boolean[] map = new boolean[26];

    public static void removeDupli(String str, int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char c = str.charAt(index);
        if(map[c-'a']){
            removeDupli(str, index+1,newStr);
        }else{
            newStr+=c;
            map[c-'a']=true;
            removeDupli(str, index+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str ="abbccda";
        removeDupli(str, 0, "");
    }
}
