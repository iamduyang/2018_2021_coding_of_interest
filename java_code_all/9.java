class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0)
    		return false;
    	int count=0,xNew=x;
    	while(xNew>0){
    		count=xNew%10+count*10;
    		xNew/=10;
    	}
    	return count==x;
    }
}


