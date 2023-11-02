package Recursion;

public class TwoDimPath {
    public static void pathDest(int cr, int cc, int dr, int dc, String res){
        if(cr > dr || cc > dc ){
            return;
        }
        if(cr == dr && cc == dc){
            System.out.println(res);
            return;
        }
        pathDest(cr+1, cc, dr, dc, res+"V");
        pathDest(cr, cc+1, dr, dc, res+"H");
    }
    public static void main(String[] args){
        int cr = 0, cc = 0, dr = 2, dc = 3;
        String res = "";
        pathDest(cr, cc, dr, dc, res);
    }
}