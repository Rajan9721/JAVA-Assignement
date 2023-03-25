package strings;

public class FindChar {
    public static void main(String[] args) {
        String str = "umbrella";
        char ch = 'e';
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                System.out.println("Letter is persent.");
                break;
            }
        }
    }
    
}
