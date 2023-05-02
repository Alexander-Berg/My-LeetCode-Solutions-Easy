import java.util.Arrays;

public class SignProductArray {
    class Solution {
        public int arraySign(int[] nums) {
            Arrays.sort(nums);
            int c = 0 ; int y = 0 ;int i =0;
            while (nums[i]<1){
                if (nums[i]==0) y++;
                else c++;
                if (i ==nums.length-1)break;
                else  i++;
            }
            if(y>=1) return 0 ;
            else if (c%2 !=0) return -1 ;
            else return 1;
        }
    }
}
