class Solution {
    public void reverseString(char[] s) {
    	if(s.length<2)
    		return ;
    	
    	int sLen=s.length;
    	for(int i=0;i<(sLen>>1);i++){
    		char temp=s[i];
    		s[i]=s[sLen-i-1];
    		s[sLen-i-1]=temp;
    	}
    	return;
    }
}

