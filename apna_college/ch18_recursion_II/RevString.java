

public class RevString {
    public static void revString(String str,int index){
        if(index==0){
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(index));
        revString(str, index-1);
    }
    public static void main(String[] args) {
        String str = "Vinita";
        revString(str, str.length()-1);
    }
}
