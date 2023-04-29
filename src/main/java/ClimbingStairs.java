public class ClimbingStairs {
    static class Solution {
        public int climbStairs(int n) {
            int sum=0;
            if(n==2) return 2;
            if(n==1) return 1;
            int a=1,b=2;
            for(int i=2;i<n;i++){
                sum=a+b;
                a=b;
                b=sum;
            }
            return sum;
        }
    };
}
