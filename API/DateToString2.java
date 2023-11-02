package API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateToString2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 8, 10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: "+formattedDate);
    }
}
