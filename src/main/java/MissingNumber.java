import java.util.stream.IntStream;

public class MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int actualSum = n * (n + 1) / 2;
            int arraySum = IntStream.of(nums).sum();
            return actualSum - arraySum;
        }
    }
}

