class Solution {
    public boolean isStrobogrammatic(String num) {
    	if(num==null||num.length()<1)
    		return true;
    	HashMap<Character,Character> intMap = new HashMap<Character,Character>();
    	intMap.put('8', '8');
    	intMap.put('1', '1');
    	intMap.put('6', '9');
    	intMap.put('9', '6');
        intMap.put('0', '0');
    	int lenNum = num.length();
    	if(lenNum%2==1){
    		char mid=num.charAt(lenNum/2);
    		if(!intMap.containsKey(mid)||mid!=intMap.get(mid))
    			return false;
    	}
    	for(int i=0;i<lenNum/2;i++){
    		char left=num.charAt(i);
    		char right = num.charAt(lenNum-i-1);
    		if(!intMap.containsKey(right)||left!=intMap.get(right))
    			return false;
    	}
    	return true;
    		
    	
    }
}




