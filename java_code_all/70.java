class Solution {
    public int climbStairs(int n) {
    	if(n<3) return n;
    	int pre1=2,pre2=1,now=3;
    	for(int i=2;i<n;i++){
    		now=pre1+pre2;
    		pre2=pre1;
    		pre1=now;
    	}
    	return now;
    }
}
