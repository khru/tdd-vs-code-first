import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderThreeNumbersTest {
    @ParameterizedTest
    @CsvSource({
            "0,0,0,'0,0,0'",
            "5,5,5,'5,5,5'",
            "100,100,100,'100,100,100'",
    })
    public void should_ordinated_three_equal_numbers(int first, int second, int third, String expected) {
        assertEquals(expected, OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @ParameterizedTest
    @CsvSource({
            "3,10,10,'3,10,10'",
            "0,1,2,'0,1,2'",
            "0,100,200,'0,100,200'",
    })
    public void should_leave_first_number_if_its_ordinated(int first, int second, int third, String expected) {
        assertEquals(expected, OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @ParameterizedTest
    @CsvSource({
            "10,3,10,'3,10,10'",
            "1,0,2,'0,1,2'",
            "100,0,200,'0,100,200'",
    })
    public void should_ordinated_second_numbers_as_first(int first, int second, int third, String expected) {
        assertEquals(expected, OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @ParameterizedTest
    @CsvSource({
            "10,10,3,'3,10,10'",
            "2,1,0,'0,1,2'",
            "100,200,0,'0,100,200'",
    })
    public void should_ordinated_last_number_as_first(int first, int second, int third, String expected) {

        assertEquals(expected, OrderThreeNumbers.orderNumbers(first,second, third));
    }

    @ParameterizedTest
    @CsvSource({
            "10,0,5,'0,5,10'",
            "2,0,1,'0,1,2'",
            "200,0,100,'0,100,200'",
    })
    public void should_ordinate_big_smallest_and_middle_number(int first, int second, int third, String expected) {

        assertEquals(expected, OrderThreeNumbers.orderNumbers(first,second, third));
    }
}
