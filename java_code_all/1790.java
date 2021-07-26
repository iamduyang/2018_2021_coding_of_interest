class Solution{
    public boolean areAlmostEqual(String s1, String s2) {
    	if(s1.length()!=s2.length())return false;
    	int count=0,temp1=0,temp2=0;
    	for(int i=0;i<s1.length();i++ ){
    		if(s1.charAt(i)!=s2.charAt(i)){
    			
    		count++;
    		if(count>2)
    			return false;
    		else if(count==1){
    			temp1=0+s1.charAt(i);
    			temp2=0+s2.charAt(i);
    		}
    		else{
    		if(temp1!=(s2.charAt(i)+0))return false;
    		if(temp2!=(s1.charAt(i)+0))return false;
    		}
    		
    		
    	 }
    	}
    	if(count==1)return false;
    	return true;
    }
}

