class Solution {
    public int combinationSum4(int[] nums, int target) {

    int[] dp = new int[target + 1];
    dp[0] = 1;

    for(int total = 1; total <= target; total++){
        for(int num : nums){
            if(num <= total){
           dp[total] += dp[total - num];

            }


        }

    }

return dp[target];

}
}
//Base case = dp[0] = 1
//if nums = [1,2,3] and target = 4
// dp[n] =  dp[4]= dp[4 -1] + dp[4-2] + dp[4-3]
//Space = O(target) and n=inner loop, time = O(m*n) m = outer loop(target)
