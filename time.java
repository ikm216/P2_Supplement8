import java.time.*;
import java.time.format.DateTimeFormatter;

public class time {
    /**
     * Returns the current date and time.
     * 
     * @return ZonedDateTime - The current date and time in system's default timezone.
     */
    public static ZonedDateTime currentDateTime(){
        return ZonedDateTime.now();
    }
    /**
     * Converts a LocalDate to an ISO 8061 UTC time string.
     * 
     * @param date LocalDate to convert.
     * @return String - ISO 8061 formatted UTC time string.
     */
    public static String convertedLocalDate(LocalDate date){
        ZonedDateTime dateTime = date.atStartOfDay(ZoneOffset.UTC);
        return dateTime.format(DateTimeFormatter.ISO_INSTANT);
    }
}
