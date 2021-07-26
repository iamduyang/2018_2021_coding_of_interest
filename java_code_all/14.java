class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length==0)
    		return "";
    	else if(strs.length==1)
    		return strs[0];
    	String outString=strs[0];
    	for(int i =1;i<strs.length;i++){
    		if (outString.length()==0) return "";
    		outString =findTwoCommon(strs[i],outString);
    			
    	}
    	return outString;
    }
    public String findTwoCommon(String str1,String str2){
    	if(str1==""||str2=="")return "";
    	int len1 =str1.length(),len2=str2.length();
    	int lenMin =len1>len2?len2:len1;
    	String outString ="";
    	for(int i=0;i<lenMin;i++){
    		if(str1.charAt(i)==str2.charAt(i))
    			outString = outString+str1.charAt(i);
    		else
    			return outString;
    	}
    	return  outString;
    		
    }
}


