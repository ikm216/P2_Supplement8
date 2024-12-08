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
    public static String convertedLocalDate(ZonedDateTime date){
        return date.format(DateTimeFormatter.ISO_INSTANT);
    }
    /**
     * Returns the number of days between two dates.
     * 
     * @param start The start date.
     * @param end   The end date.
     * @return long - The number of days between startDate and endDate.
     */
    public static long numberOfDaysBetween(LocalDate start, LocalDate end){
        return java.time.temporal.ChronoUnit.DAYS.between(start, end);
    }
}
