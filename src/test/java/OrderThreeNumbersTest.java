import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderThreeNumbersTest {
    @Test
    public void should_ordinated_three_equal_numbers() {
        int first = 0, second = 0, third = 0;
        assertEquals("0,0,0", OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @Test
    public void should_leave_first_number_if_its_ordinated() {
        int first = 3, second = 10, third = 10;

        assertEquals("3,10,10", OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @Test
    public void should_ordinated_second_numbers_as_first() {
        int first = 10, second = 3, third = 10;

        assertEquals("3,10,10", OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @Test
    public void should_ordinated_last_number_as_first() {
        int first = 10, second = 10, third = 3;

        assertEquals("3,10,10", OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @Test
    public void should_ordinate_big_smallest_and_middle_number() {
        int first = 7, second = 1, third = 5;

        assertEquals("1,5,7", OrderThreeNumbers.orderNumbers(first,second, third));
    }
}
