package Recursion;

public class TilingWaysPrint {
    public static void tilingWaysPrint(String str, int n){
        if(n<=3){
            System.out.println(str);

        }
        if((n-1)>0){
            tilingWaysPrint(str+"V", n-1);
        }
        if((n-2)>0){
            tilingWaysPrint(str+"H", n-2);
        }


    }
    public static void main(String[] args){
        tilingWaysPrint("", 4);
    }

}
