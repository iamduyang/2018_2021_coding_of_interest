class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length<1)
            return -1;
        int lenNum =nums.length;
        int candidate=nums[0],count=1;
        for(int i=1;i<lenNum;i++){
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
                if(count==0){
                    count=1;
                    candidate=nums[i];
                }
            }
        }
        count=0;
        for(int i=0;i<lenNum;i++){
            if(candidate==nums[i])
                count++;
        }
        if(count>(lenNum/2))
            return candidate;
        else 
            return -1;
    }
}

