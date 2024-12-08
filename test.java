import org.junit.*;
import java.time.*;

public class test{
    @Test
    public void test_should_return_current_date_time(){
        ZonedDateTime currentDT = time.currentDateTime();
        Assert.assertNotNull(currentDT);    
    }
    @Test
    public void test_should_return_converted_local_date(){
        LocalDate date = LocalDate.of(2024, 12, 3);
        String convertedDate = time.convertedLocalDate(date);
        Assert.assertEquals("2024-12-03T00:00:00Z", convertedDate);
    }
    @Test
    public void test_should_return_days_between_dates(){
        LocalDate start = LocalDate.of(2024, 12, 1);
        LocalDate end = LocalDate.of(2024, 12, 7);
        long days = time.numberOfDaysBetween(start, end);
        Assert.assertEquals(6, days);
        
    }
}