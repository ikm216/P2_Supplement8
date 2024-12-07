import org.junit.*;
import java.time.*;

public class test{
    @Test
    public void test_should_return_current_date_time(){
        ZonedDateTime currentDT = time.currentDateTime();
        Assert.assertNotNull(currentDT);    
    }
}