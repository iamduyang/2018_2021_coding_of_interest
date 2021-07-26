class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if(nums==null || nums.length<2)
    		return false;
    	HashSet<Integer> numsSet = new HashSet<Integer>();
    	for(int i=0;i<nums.length;i++){
    		if(numsSet.contains(nums[i]))
    			return true;
    		else
    			numsSet.add(nums[i]);
    	}
    	return false;
    }
}


