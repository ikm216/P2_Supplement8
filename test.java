import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}