package strings;

public class Concatenation {
    public static void main(String[] args) {
        String str1 = "Rajan";
        String str2 = " Rajbhar";
// By using + operator-

        String name = str1 + str2;
        System.out.println(name);

        name = str1 + str2 + " From" + " Azamgarh";
        System.out.println(name);

// By using concat() method-

        String str = "Pw ";
        str = str.concat("Skills");
        System.out.println(str);

    }
}
