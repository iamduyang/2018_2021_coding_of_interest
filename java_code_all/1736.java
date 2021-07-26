class Solution {
    public String maximumTime(String time) {
    	String h1,h2;
    	if(time.charAt(0)=='?'&&time.charAt(1)=='?')
    		h1="23";
    	else if(time.charAt(0)!='?'&&time.charAt(1)!='?')
    		h1 =""+time.charAt(0)+time.charAt(1);
    	else if(time.charAt(0)=='?'&&time.charAt(1)!='?'){
    		if(time.charAt(1)>'3')
    			h1 ="1"+time.charAt(1);
    		else
    			h1 ="2"+time.charAt(1);
    	}
    	else{
    		if(time.charAt(0)>'1')
    			h1 =""+time.charAt(0)+'3';
    		else
    			h1 =""+time.charAt(0)+'9';
    		
    	}
    	if(time.charAt(3)=='?'&&time.charAt(4)=='?')
    		h2="59";	
    	else if (time.charAt(3)!='?'&&time.charAt(4)!='?')
    		h2 =""+time.charAt(3)+time.charAt(4);
    	else if(time.charAt(3)=='?'&&time.charAt(4)!='?')
    		h2 ="5"+time.charAt(4);
    	else 
    		h2 =""+time.charAt(3)+"9";
    	
    	
    		
    	 
    	
    	String returnStr=  h1+":"+h2;
    	return returnStr;
    }
}

