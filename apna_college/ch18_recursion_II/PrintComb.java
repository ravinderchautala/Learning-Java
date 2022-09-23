public class PrintComb {
    public static String keypad[] = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printComb(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char c = str.charAt(index);
        String mapping = keypad[c-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "1";
        printComb(str, 0, "");
    }
}
