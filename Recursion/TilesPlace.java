package Recursion;

public class TilesPlace {
    public static int tilesPlace(int n){
        int res = 0;
        if(n<=3){
            return n;
        }
        res = tilesPlace(n-1)+ tilesPlace(n-2);
        return res;
    }
    public static void main(String[] args){
        int n = 4;
//        int bordSize = 2*n;
//        int tileSize = 2*1;
        System.out.println("Ways: "+tilesPlace(n));
    }
}
