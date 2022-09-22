public class CharShift {
    public static void charShift(String str,int index,int count,String str1){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                str1+='x';
            }
            System.out.println(str1);
            return;
        }
        char c = str.charAt(index);
        if(c=='x'){
            count++;
            charShift(str, index+1,count, str1);
        }else{
            str1+=c;
            charShift(str, index+1,count, str1);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        charShift(str, 0,0, "");
    }
}
