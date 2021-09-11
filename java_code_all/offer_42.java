class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<1)
            return 0;
        int res=nums[0],numLen = nums.length,haveCurrent=nums[0];

        for(int i=1;i<numLen;i++){
           // notHave=res;
            haveCurrent=Math.max(nums[i],nums[i]+haveCurrent);
            res=Math.max(res,haveCurrent);
        }


        return res;
    }
}

