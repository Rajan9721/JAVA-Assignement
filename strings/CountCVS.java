package strings;

public class CountCVS {
    public static void main(String[] args){
        int vowels = 0, cons = 0, special = 0;
        String string = "rajan@gmail.com";

        int n = string.length();
        System.out.println("String is : "+string);
        for(int i = 0; i<n; i++){

            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
                vowels++;
            }
            else if (string.charAt(i) == '@' || string.charAt(i) == '#' || string.charAt(i) == '$' || string.charAt(i) == '&' || string.charAt(i) == '^' || string.charAt(i) == '.'){
                special++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Constant : "+cons);
        System.out.println("Special Character : "+ special);
    }
}
