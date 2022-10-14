package datastructure.leetcode;

import java.util.Arrays;

public class PartitionSum {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if ( (sum & 1) == 1) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num)
                    dp[i] = dp[i] || dp[i-num];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        PartitionSum partitionSum = new PartitionSum();
        int[] nums = new int[]{1,5,11,14};
        System.out.println(Arrays.toString(nums));
        boolean res = partitionSum.canPartition(nums);
        System.out.println("result is " + res);

    }
}
