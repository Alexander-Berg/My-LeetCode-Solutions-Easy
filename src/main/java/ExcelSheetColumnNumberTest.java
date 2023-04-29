import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() {
        ExcelSheetColumnNumber.Solution solution = new ExcelSheetColumnNumber().new Solution();
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(701, solution.titleToNumber("ZY"));
        assertEquals(16384, solution.titleToNumber("XFD"));
       // assertEquals(1048576, solution.titleToNumber("XWY"));
    }

    @Test
    public void testTitleToNumberWithNull() {
        ExcelSheetColumnNumber.Solution solution = new ExcelSheetColumnNumber().new Solution();
        assertEquals(-1, solution.titleToNumber(null));
    }

    @Test
    public void testTitleToNumberWithEmptyString() {
        ExcelSheetColumnNumber.Solution solution = new ExcelSheetColumnNumber().new Solution();
        assertEquals(0, solution.titleToNumber(""));
    }
}
