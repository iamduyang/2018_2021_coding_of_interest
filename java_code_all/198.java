class Solution {
    public int rob(int[] nums) {
    	if(nums==null || nums.length<1)
    		return 0;
    	int numsLen = nums.length;
    	if(numsLen<2)
    		return nums[0];
    	int a_k_1 = 0, a_k =nums[0],pre_a_k_1=0,pre_a_k=a_k;
    	for(int i=1;i<nums.length;i++){
    		
    		a_k=nums[i]+pre_a_k_1;
    		a_k_1 =Math.max(pre_a_k_1, pre_a_k);
    		pre_a_k_1 = a_k_1;
    		pre_a_k=a_k;
    	}
    	return (a_k>a_k_1)?a_k:a_k_1;
    }
}

