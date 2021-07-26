class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int len1=nums.length;
    	for (int i=0;i<len1-1;i++){
    		for(int j=i+1;j<len1;j++){
    		if (nums[i]+nums[j]==target){
    			int[] returnVal = {i,j};
    			return returnVal;
    			}
    		}
    	}
    	return new int[0];
    	
    }
}