package strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "azamgarhaaah";
        int n = str.length();


        String newStr = "";
        for(int i = 0; i<n; i++){
                if(str.charAt(i) == str.charAt(n-1)){
                    continue;
                }
                else{
                    newStr += str.charAt(i);
                }
        }
        System.out.println(newStr);


    }
}
