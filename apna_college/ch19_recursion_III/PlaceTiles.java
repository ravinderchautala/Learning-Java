package apna_college.ch19_recursion_III;

public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vp = placeTiles(n-m, m);
        int hp = placeTiles(n-1, m);
        return vp+hp;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int result = placeTiles(n, m);
        System.out.println(result);
    }
}
