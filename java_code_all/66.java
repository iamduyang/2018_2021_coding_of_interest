class Solution {
    public int[] plusOne(int[] digits) {
    	int i=digits.length-1;
    	for(;i>=0;i--){
    		if(digits[i]<9){
    			digits[i]+=1;
    			return digits;
    		}
    		else digits[i]=0;
    			
    	}
    	if(i!=-1)
    		return digits;
    	int[] returnDig=new int[digits.length+1];
    	returnDig[0]=1;
    	for(int j=0;j<digits.length;j++)
    		returnDig[j+1]=digits[j];
    	return returnDig;
    	
    	
    }
}
