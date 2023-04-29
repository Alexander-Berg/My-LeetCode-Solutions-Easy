import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* RomanToInteger Tester. 
* 
* @author <Alexander Berg>
* @since <pre>Apr 27, 2023</pre> 
* @version 1.0 
*/ 
public class RomanToIntegerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: romanToInt(@NotNull String s)
     */
    @Test
    public void testRomanToIntWithValidInput() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int actualOutput = romanToInteger.romanToInt("MCMXCIV");
        int expectedOutput = 1994;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRomanToIntWithInvalidInput() {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("IIII");

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRomanToIntWithEmptyInput() {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("");

    }

    @Test
    public void testRomanToIntWithSingleCharacterInput() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int actualOutput = romanToInteger.romanToInt("X");
        int expectedOutput = 10;
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testRomanToIntWithMixedCaseInput() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int actualOutput = romanToInteger.romanToInt("MCmXCIV");
        int expectedOutput = 1994;
        assertEquals(expectedOutput, actualOutput);
    }

}