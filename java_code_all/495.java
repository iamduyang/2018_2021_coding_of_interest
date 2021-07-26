class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    	if(timeSeries==null || timeSeries.length<1 )
    		return 0;
    	int timeLen = timeSeries.length;
    	if (timeLen<2)
    		return duration;
    	int poisionedDuration = 0;
    	for(int i=1;i< timeLen;i++){
    		if((timeSeries[i]-timeSeries[i-1])>duration)
    			poisionedDuration+=duration;
    		else
    			poisionedDuration+=timeSeries[i]-timeSeries[i-1];
    	}
    	poisionedDuration+=duration;
    	return poisionedDuration;
    }
}

