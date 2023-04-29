import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBuzz.Solution solution = new FizzBuzz().new Solution();

        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");

        assertEquals(expected, solution.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzzSingle() {
        FizzBuzz.Solution solution = new FizzBuzz().new Solution();

        List<String> expected = new ArrayList<>();
        expected.add("1");

        assertEquals(expected, solution.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzzNegative() {
        FizzBuzz.Solution solution = new FizzBuzz().new Solution();

        List<String> expected = new ArrayList<>();

        assertEquals(expected, solution.fizzBuzz(-1));
    }
}

