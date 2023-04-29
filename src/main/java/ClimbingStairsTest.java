import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairsWith0Steps() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(1, solution.climbStairs(0));
    }

    @Test
    public void testClimbStairsWith1Step() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    public void testClimbStairsWith2Steps() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void testClimbStairsWith3Steps() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void testClimbStairsWith4Steps() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    public void testClimbStairsWith5Steps() {
        ClimbingStairs.Solution solution = new ClimbingStairs.Solution();
        assertEquals(8, solution.climbStairs(5));
    }
}
