class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> returnList = new ArrayList<Integer>();
    	for(int i=left;i<=right;i++){
    		if(ifSelfDevide(i))
    			returnList.add(i);
    	}
    	return returnList;
    }
    public boolean ifSelfDevide(int num){
    	int dividendD = num,cur=0;
    	while(dividendD>0){
    		cur = dividendD%10;
    		if(cur==0)return false;
    		if(num%cur!=0)
    			return false;
    		dividendD = dividendD/10;
    	}
    	
    	
    	return true;
    }
}


