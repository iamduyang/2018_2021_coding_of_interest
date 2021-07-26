class Solution {
    public List<String> fizzBuzz(int n) {
    	List<String> returnList =new ArrayList<String>();
    	
    	for(int i=1;i<(n+1);i++)
    		returnList.add(isFizzBuzz(i));
    	return  returnList;
    }
    public String isFizzBuzz(int n){
    	if(n%15==0)
    		return "FizzBuzz";
    	if(n%3==0)
    		return "Fizz";
    	if(n%5==0)
    		return "Buzz";
    	return ""+n;
    }
    
}


