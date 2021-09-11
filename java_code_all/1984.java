class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums==null||nums.length<2)
            return 0;
        Arrays.sort(nums);
        int right=k-1,minDifference = nums[right]-nums[right-k+1];
        for(;right<nums.length;right++){
            minDifference=Math.min(nums[right]-nums[right-k+1],minDifference);
        }
        return minDifference;
    }
}



