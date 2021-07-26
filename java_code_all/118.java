class Solution {
    public List<List<Integer>> generate(int numRows) {
    	if(numRows<1)
    		return null;
    	List<Integer> tempList = new ArrayList<Integer>();
    		
    	List<List<Integer>> returnList= new ArrayList<List<Integer>>();
    	tempList.add(1);
    	returnList.add(tempList);
    	if(numRows==1)
    		return returnList;
    	tempList = new ArrayList<Integer>();
    	tempList.add(1);
    	tempList.add(1);
    	returnList.add(tempList);
    	for(int i=2;i<numRows;i++){
    		tempList = new ArrayList<Integer>();
    		tempList.add(1);
    		for (int j=1;j<i;j++)
    			tempList.add(returnList.get(i-1).get(j-1)+returnList.get(i-1).get(j));
    		tempList.add(1);
    		returnList.add(tempList);
    	}
    	return returnList;
    }
}


