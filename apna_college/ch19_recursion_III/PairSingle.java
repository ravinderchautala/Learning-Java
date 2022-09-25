package apna_college.ch19_recursion_III;

public class PairSingle {
    public static int invite(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        int sin = invite(n-1);
        int pair =(n-1)*invite(n-2);
        return sin+pair;
    }
    public static void main(String[] args) {
        int n =3;
        int res = invite(n);
        System.out.println(res);
    }
}
