class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<1)
            return 0;
        int max=nums[0],preMax=nums[0];
        for(int i=1;i<nums.length;i++){
            preMax=Math.max(preMax+nums[i],nums[i]);
            max=Math.max(preMax,max);
        }
        return max;
    }
}