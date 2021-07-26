class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n==1)
    		return true;
    	if(n<1)
    		return false;
    	int temp=n;
    	while(n>1){
    		n>>=1;
    		if(n*2!=temp)
    			return false;
    		temp=n;
    	}
    	return true;
    }
}



