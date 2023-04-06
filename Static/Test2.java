package Static;

public class Test2 {
    public static void main(String[] args) {
        // int t;
        // System.out.println(t);

        // for (int i =0; 0; i++){
        //     System.out.println("hello");
        //     break;
        // }

        // System.out.println(10*20+"Rajan");
        // System.out.println("Rajan"+10*20);

        // int x = 0;
        // int y = 0;
        // for(int z =0; z <5; z++){
        //     if(++x>2 || ++y>2){
        //         x++;
        //     }
        // }
        // System.out.println(x+" "+y);

        int x , y = 10; 
        int z = 12;
        x = y++ + z++;
        System.out.println(x + ""+y+""+z);

        System.out.println(20+1.34f+"raj"+"B");

        int a=20, b=10, c=5;
        if((a>>1==b)&& (b<<1==a)){
            System.out.println("posiible");
        }
        else{
            System.out.println("Not");
        }


    }
    
}
