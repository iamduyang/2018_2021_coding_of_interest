class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	if(nums==null || nums.length<1)
    		return 0;
    	int count=0,maxOnes=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==1)
    			count++;
    		else{
    			maxOnes=Math.max(count, maxOnes);
    			count=0;
    		}
    	}
    	maxOnes=Math.max(count, maxOnes);
    	return maxOnes;
    }
}


