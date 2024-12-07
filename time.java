import java.time.*;

public class time {
    /**
     * Returns the current date and time.
     * 
     * @return ZonedDateTime - The current date and time in system's default timezone.
     */
    public static ZonedDateTime currentDateTime(){
        return ZonedDateTime.now();
    }
}
