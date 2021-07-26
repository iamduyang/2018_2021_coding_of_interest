class Solution {
    public int[] countBits(int n) {
    	int[] returnArray = new int[n+1];
    	returnArray[0]=0;
    	for(int i=1;i<n+1;i++)
    		returnArray[i]=returnArray[i>>1]+(i&1);
    	return returnArray;
    }
}


