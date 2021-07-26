class Solution {
    public int sumOfUnique(int[] nums) {
    	int sum=0,numsLen=nums.length;
    	if(numsLen==0)return 0;
    	HashSet<Integer>  intSet = new HashSet<Integer>();
    	HashSet<Integer>  doubleSet = new HashSet<Integer>();
    	for(int i=0;i<numsLen;i++){
    		if(!intSet.contains(nums[i])&&!doubleSet.contains(nums[i]))
    			intSet.add(nums[i]);
    		else if(intSet.contains(nums[i])){
    			intSet.remove(nums[i]);
    			doubleSet.add(nums[i]);
    		}
    		
    	}
    	for (int i:intSet){
    		sum+=i;
    	}
    	return sum;	
    }
}


