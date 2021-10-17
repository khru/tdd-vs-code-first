import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderThreeNumbersTest {
    @Test
    public void should_ordinated_three_equal_numbers() {
        int first = 0, second = 0, third = 0;
        assertEquals("0,0,0", OrderThreeNumbers.orderNumbers(first,second, third));
    }
}
