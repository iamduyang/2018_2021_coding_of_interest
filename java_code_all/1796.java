class Solution {
    public int secondHighest(String s) {
    	if(s.length()<2) return -1;
    	int max1=-1,max2=-1,current=-1;
    	for (int i=0;i<s.length();i++){
    		if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
    			current = s.charAt(i)-48;
    			if(current>max1){
    				max2=max1;
    				max1=current;
    			}
    			else if(current<max1&&current>max2)
    				max2=current;
    		}
    	}
    	
    	return max2;
    }
}


