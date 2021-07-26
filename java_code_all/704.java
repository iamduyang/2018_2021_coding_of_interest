class Solution {
    public int search(int[] nums, int target) {
         int lenN=nums.length;
         if (lenN==0) return -1;
         int start=0,end=lenN-1,mid=0;
         while(start<=end){
        	  mid =(start+end)/2;
        	  if(nums[mid]==target)
        		  return mid;
        	  else if(target>nums[mid])
        		  start=mid+1;
        	  else 
        		  end = mid-1;
         }
         return -1;
    }
}

