class Solution {
    public int minPairSum(int[] nums) {
        if(nums==null || nums.length<2)
            return 0;
        Arrays.sort(nums);
        int returnNum=nums[0]+nums[nums.length-1],halfLen = nums.length/2;
        for(int i=1;i<halfLen;i++){
            returnNum=Math.max(nums[i]+nums[nums.length-1-i],returnNum);
        }
        return returnNum;
    }
}

