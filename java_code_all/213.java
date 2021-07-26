
class Solution {
    public int rob(int[] nums) {
    	if(nums == null|| nums.length<1)
    		return 0;
    	int numsLen =nums.length;
    	if(numsLen==1)
    		return nums[0];
    	if(numsLen==2)
    		return nums[0]>nums[1]?nums[0]:nums[1];
    	int a_k_1=0,a_k=nums[0],pre_a_k_1 = a_k_1,pre_a_k=a_k;
    	for(int i=1;i<numsLen-1;i++){
    		a_k=a_k_1+nums[i];
    		a_k_1 =Math.max(pre_a_k, pre_a_k_1);
    		pre_a_k=a_k;
    		pre_a_k_1=a_k_1;
    		
    	}
    	int oneMax = a_k>a_k_1?a_k:a_k_1;
    	a_k_1=0;a_k=nums[numsLen-1];pre_a_k_1 = a_k_1;pre_a_k=a_k;
    	for(int i=numsLen-2;i>0;i--){
    		a_k=a_k_1+nums[i];
    		a_k_1 =Math.max(pre_a_k, pre_a_k_1);
    		pre_a_k=a_k;
    		pre_a_k_1=a_k_1;
    		
    	}
    	int twoMax = a_k>a_k_1?a_k:a_k_1;
    	return oneMax>twoMax?oneMax:twoMax;
    }
}

