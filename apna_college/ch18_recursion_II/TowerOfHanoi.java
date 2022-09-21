
public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String source,String helper,String dest){
        if(n==1){
            System.out.println("Disk "+ n +" moved from "+ source + " to the rod "+ dest);
            return;
        }
        towerOfHanoi(n-1,source, dest,helper);
        System.out.println("Disk "+ n +" moved from "+ source + " to the rod "+ dest);
        towerOfHanoi(n-1,helper, source, dest);
    }
    public static void main(String[] args) {
        int n=2;
        towerOfHanoi(n, "A", "B", "C");
    }
}
