class Solution {
    public int singleNumber(int[] nums) {
    	int candidate = nums[0];
    	for(int i=1;i<nums.length;i++)
    		candidate^=nums[i];
    	return candidate;
    }
}

