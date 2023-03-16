package strings;

public class StringEx {
    public static void main(String[] args) {

        String str = "Good"; // Line 3

        change(str); // Line 4

        System.out.println(str); // Line 5

    }

    private static void change(String s) {

        s.concat("_Morning"); // Line 9

        StringBuilder sb = new StringBuilder("Good"); // Line 3 change(sb); //Line 4

        System.out.println(sb); // Line 5

    }

    private static void change(StringBuilder s) {

        s.append("_Morning"); // Line 9

    }

}
