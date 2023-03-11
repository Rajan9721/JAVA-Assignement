package complexPattern;

public class SixPatterns {
    public static void main(String[] args) {
        //  *
        //   *
        //    *
        //     *
        //      *
     System.out.println("**************Pattern 1***************");   
     System.out.println();
        int n = 11;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("**************Pattern 2***************");

       System.out.println();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j || i+j==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("**************Pattern 3***************");
        System.out.println();
       
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j || i+j==n-1 || j==0 || j==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("    ");

            for(int j = 0; j<n; j++){
                if(i==j || i+j==n-1 || j==0 || j==n-1 || i==0 || i==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

            
        }
        System.out.println("**************Pattern 4***************");
        System.out.println();
       
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j || i+j==n-1 || j==0 || j==n-1 || i==0 || i==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("**************Pattern 5***************");
        System.out.println();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j || i+j==n-1 || j==0 || j==n-1 || i==0 || i==n-1 || 
                i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("    ");

            for(int j = 0; j<n; j++){
                if( i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        System.out.println("**************Pattern 6***************");
        System.out.println();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }



    }
}
