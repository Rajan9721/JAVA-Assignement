package strings;

public class RemoveCons {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String newstr = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='a'){
                newstr = newstr + "_";
            }
            else{
                newstr = newstr + str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
