import java.time.*;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime currentDT = time.currentDateTime();
        System.out.println("Current Date and Time: " + currentDT);

        ZonedDateTime date = ZonedDateTime.of(2024, 12, 7, 14, 10, 31, 0, ZoneOffset.UTC);
        System.out.println("ISO 8061 UTC Date: " + date);
    }
}
