package ArraysEx;

public class Basic_Important_Codes {
    public static void main(String[] args) {

//  Question : 01
        if(true)
        System.out.println("rajan");

        if(true)
//            int i = 10;
//              compile time error


//  Question :  02
        if(true){
            int i = 10;
        }

//  Question :    03
        if(false)
            System.out.println("Hello");
            System.out.println("Hii");

//  Question :  04
        int x = 10;
        switch (x){
//            System.out.println("Compile time error due to no finding 'case' block ");
        }

//  Question :  05
        int r = 10 ;
        int s = 20;
        switch (r){
            case 10:
                System.out.println(10);
                System.out.println("Rajan");
                break;

//            case s: // Compile time error (constant expression are allowed)
//                System.out.println(20);
            case 25:
                System.out.println(25);
        }


//  Question :  06
        int m = 15;
        final int n = 10;
        switch (m){
            case 15:
                System.out.println("m=15");
            case n: // no error because final variable are constant.
                System.out.println(n);

        }

//  Question :  07
        byte a = 10;
        switch (a){
            case 10:
                System.out.println(10);
            case 100:
                System.out.println(100);

//                Level value should be within the range of switch argument otherwise it will give the compile time error.
//            case 1000:
//                System.out.println(1000);
        }

//  Question :  08
        byte b = 10;
        switch (b+1) // No error because of byte + int => int
        {
            case 10:
                System.out.println(10);
            case 100:
                System.out.println(100);
            case 1000:
                System.out.println(1000);
        }

    }
}
