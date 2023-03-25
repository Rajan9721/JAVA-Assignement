package strings;

public class Compare {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";
        String str4 = "Java";
        // when we create a string without new keyword then objects are create in the SCP(String Constant Pool).
        // and if the value are same in the constant pool then it will create only once.
        System.out.println(str1 == str2); // false because both s1 and s2 refers to different objetcs

        System.out.println(str1.equals(str2)); // true because .equals() method compare the value of the object.

        System.out.println(str3 == str4); // true because str3 and str4 refers same objects value

        System.out.println(str3.equals(str4)); // true
   }
    
}
