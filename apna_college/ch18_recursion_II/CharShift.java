public class CharShift {
    public static void charShift(String str,int index,int count,String str2){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                str2+='x';
            }
            System.out.println(str2);
            return;
        }
        char c = str.charAt(index);
        if(c=='x'){
            count++;
            charShift(str, index+1,count, str2);
        }else{
            str2+=c;
            charShift(str, index+1,count, str2);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        charShift(str, 0,0, "");
    }
}
