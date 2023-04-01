package strings;


public class SortAlpha {
    public static void main(String[] args) {
        String str = "RajanRajbhar Raj";
        String temp = "";
        
        for(int i = 0; i<srr[i].length()-1; i++){
            for(int j = i+1; j<srr[i].length()-1; j++){
                if(srr[i].charAt(i)> srr[j].charAt(j)){
                    temp = srr[j];
                    srr[j] = srr[i];
                    srr[i] = temp;
                }
                else{
                    temp = srr[i];
                }
            }
            temp = temp + srr[i];
        }
        System.out.println(temp);
    }
    
}
