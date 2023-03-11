package Pattern_Assignment;

public class Q1 {
    public static void main(String[] args) {
        // Q1(a)
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==(n-1)/2 || j==n-1){
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
