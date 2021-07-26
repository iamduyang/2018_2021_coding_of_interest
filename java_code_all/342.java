class Solution {
    public boolean isPowerOfFour(int n) {
    	if(n==1)
    		return true;
    	if(n<4)
    		return false;
    	int preN=n;
    	while(n>4){
    		n>>=2;
    		if(n*4!=preN)
    			return false;
    		preN=n;
    	}
    	if(n==4)
    		return true;
    	else
    		return false;
    }
}


