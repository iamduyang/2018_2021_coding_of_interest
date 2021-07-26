class Solution {
    public int removeElement(int[] nums, int val) {
    	int numsLen = nums.length;
    	if(numsLen==0)return 0;
    	int count=0;
    	for(int i=0;i<numsLen;i++){
    		if(nums[i]==val)
    			count++;
    		else
    			nums[i-count]=nums[i];
    		
    		
    	}
    	return numsLen-count;
    }
}
