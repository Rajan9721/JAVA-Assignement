package strings;

public class ReverseSen {
    public static void main(String[] args) {
        String str = "Think Twice";
        String str2 = "";
        String srr[] = str.split(" ");
        for(int i = 0; i<srr.length; i++){
            for (int j = srr[i].length()-1; j>=0; j--){
                str2 = str2 +srr[i].charAt(j);
            }
            str2 = str2 + " ";
        }
        System.out.println(str2);

// OR
        String str3 = "";
        for(String num : srr){
            
            for (int j = num.length()-1; j>=0; j--){
                str3 = str3 +num.charAt(j);
            }
            str3 = str3 + " ";
        }
        System.out.println(str2);
        

    }
    
}
