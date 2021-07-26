class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	if(nums1.length<1||nums2.length<1){
    		int[] returnArray ={};
    		return returnArray;
    	}
    		
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int len1=nums1.length,len2=nums2.length,i1=0,i2=0;
    	HashSet<Integer> numsSet= new HashSet<Integer>();
    	
    	while(i1<len1&&i2<len2){
    		if(nums1[i1]<nums2[i2])
    			i1++;
    		else if(nums1[i1]>nums2[i2])
    			i2++;
    		else{
    			numsSet.add(nums1[i1]);
    			i1++;i2++;
    		}
    			
    	}
    	int[] returnArray =new int[numsSet.size()] ;
    	int iii=0;
    	for(int intI:numsSet){
    		returnArray[iii]=intI;
    		iii++;
    	}
    	return returnArray;
    }
}






