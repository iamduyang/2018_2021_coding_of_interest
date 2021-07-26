class Solution {
    public int uniquePaths(int m, int n) {
    	if(m<2||n<2)
    		return 1;
    	if(m>n)
    		return ComAB(m+n-2,n-1);
    	else return ComAB(m+n-2,m-1);
    }
    public int ComAB(int a,int b){
    	long returnInt=a;
    	for(int i=2;i<=b;i++)
    		returnInt=returnInt*(a-i+1)/i;
    	return (int)returnInt;
    	
    }
}


