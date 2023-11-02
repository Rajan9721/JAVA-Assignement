package API;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args)
    {
        List<String> CompanyList = new ArrayList<>();
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");
        CompanyList.stream().sorted().forEach(
                System.out::println);
    }
}
