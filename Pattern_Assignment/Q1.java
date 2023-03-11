package Pattern_Assignment;

public class Q1 {
    public static void main(String[] args) {
        // Q1(1)
        int n = 11; 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(2)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<(n-1) || i==(n-1) && j<(n-1)/2) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(3)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<(n-1) || i==n-1 && j>0 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        
        //Q1(4)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(5)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j<(n-1)/2 || j==0 || i==(n-1) && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(6)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(7)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<(n-1) || i==(n-1) && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==(n-1)/2 && j>2 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
System.out.println();
        //Q1(8)
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("      ");

            for(int j = 0; j<n; j++){
                if(j==0 || j==(n-1) || i==(n-1)/2){
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
