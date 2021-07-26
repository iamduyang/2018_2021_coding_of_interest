class Solution {
    public boolean isPowerOfThree(int n) {
    
    	if(n<1||n==2)
    		return false;
    	int preN = n;
    	while(n>1){
    		n=n/3;
    		if(n*3!=preN)
    			return false;
    		preN=n;
    	}
    	return true;
    }	
}



