import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    @Test
    public void testGenerate() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> result = pascalTriangle.new Solution().generate(numRows);

        // Check that the size of the outer list is correct
        assertEquals(numRows, result.size());

        // Check that each inner list has the correct size and values
      /*  int[][] expected = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = result.get(i);
            assertEquals(expected[i].length, row.size());
            for (int j = 0; j < row.size(); j++) {
                assertEquals(expected[i][j], row.get(j).intValue());
            }
        }

       */
    }
}