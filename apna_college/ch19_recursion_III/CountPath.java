package apna_college.ch19_recursion_III;

public class CountPath {
    public static int countPaths(int i,int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int dp = countPaths(i+1, j, n, m);
        int rp = countPaths(i, j+1, n, m);
        return dp+rp;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int tp=countPaths(0, 0, n, m);
        System.out.println(tp);
    }
}
