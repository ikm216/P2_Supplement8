import org.junit.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class test{
    @Test
    public void test_should_return_current_date_time(){
        ZonedDateTime currentDT = time.currentDateTime();
        Assert.assertNotNull(currentDT);    
    }
    @Test
    public void test_should_return_converted_local_date(){
        ZonedDateTime date = ZonedDateTime.of(2024, 12, 7, 14, 10, 31, 0, ZoneOffset.UTC);
        String test = date.format(DateTimeFormatter.ISO_INSTANT);
        String convertedDate = time.convertedLocalDate(date);
        Assert.assertEquals(test, convertedDate);
    }
    @Test
    public void test_should_return_days_between_dates(){
        LocalDate start = LocalDate.of(2024, 12, 1);
        LocalDate end = LocalDate.of(2024, 12, 7);
        long days = time.numberOfDaysBetween(start, end);
        Assert.assertEquals(6, days);
    }
}