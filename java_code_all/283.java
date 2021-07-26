class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length<2)
            return ;
        int count=0,numLen = nums.length;
        for(int i=0;i<numLen;i++){
            if(nums[i]==0)
                count++;           
            else
                if(count!=0)
                    nums[i-count]=nums[i];
        
        }
        for(int i=0;i<count;i++)
            nums[numLen-i-1]=0;
        return ; 

    }
}


