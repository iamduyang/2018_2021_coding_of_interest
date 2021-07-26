class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i=0;i<nums.length;i++){
        	sum += nums[i];
        }
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
        	if ((sum-nums[i])==leftSum*2)
        		return i;
        	else{
        		leftSum+=nums[i];
        	} 
        		
        }
        return -1;
        	
    }
}
