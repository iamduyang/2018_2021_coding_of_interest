class Solution {
    public int trailingZeroes(int n) {
    	if(n<0) n=-n;
    	int returnNo=0;
    	while(n>=5){
    		returnNo+=n/5;
    		n=n/5;
    	}
    	return returnNo;
    }
    
}



