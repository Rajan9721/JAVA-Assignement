package strings;

import java.util.Objects;

public class Compare {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";
        String str4 = "Java";
    

        String str5 = "";
        String str6 = "";
        String str7 = "java";
        // when we create a string without new keyword then objects are create in the SCP(String Constant Pool).
        // and if the value are same in the constant pool then it will create only once.
 
 // Using == operator
        System.out.println(str1 == str2); // false because both s1 and s2 refers to different objetcs
        System.out.println(str3 == str4); // true because str3 and str4 refers same objects value
        System.out.println("------------------------------------------------------");

// Using equals() method
        System.out.println(str1.equals(str2)); // true because .equals() method compare the value of the object.
        System.out.println(str3.equals(str4)); // true
        System.out.println("------------------------------------------------------");


// Using equalsIgnorCase() method

        System.out.println(str1.equalsIgnoreCase(str7)); //true
        System.out.println("------------------------------------------------------");

// Using Objects.equals(Object a, Object b)
        System.out.println(Objects.equals(str1, str2)); // true
        System.out.println(Objects.equals(str1, str3)); // true
        System.out.println(Objects.equals(str3, str4)); // true
        System.out.println(Objects.equals(str5, str6)); // true
        System.out.println(Objects.equals(str1, str7)); // false
        System.out.println(Objects.equals(str1, str6)); // false
        System.out.println("------------------------------------------------------");

// Using compareTo() method
        System.out.println(str1.compareTo(str2)); // positive value
        System.out.println(str1.compareTo(str3)); // positive value
        System.out.println(str1.compareTo(str7)); // negative value 

   }
    
}
