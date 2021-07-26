
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	 List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    	 if(nums.length<1)
    		 return returnList;
    	 int numsLen = nums.length;
    	 int setNum = (int)Math.pow(2,numsLen );
    	 for(int i=0;i<setNum;i++){
    		 List<Integer> currentList = new ArrayList<Integer>();
    		 String magicStr = num2str(i,numsLen);
    		 for(int j=0;j<numsLen;j++){
    			 if(magicStr.charAt(j)=='1')
    				 currentList.add(nums[j]); 
    		 }
    		 returnList.add(currentList);
    	 }
    	 
    	 
    	 return returnList;
    }
    public String num2str(int num,int width){
    	String outStr="";
    	int count=0;
    	while(num>0){
    		if(num%2==1)
    			outStr="1"+outStr;
    		else
    			outStr = "0"+outStr;
    		count++;
    		num=num/2;
    	}
        int remain = width-count;
    	for(int i=0;i<remain;i++)
    		outStr = "0"+outStr;
    	return outStr;
    }
}


