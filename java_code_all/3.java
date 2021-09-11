class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()<1)
            return 0;
        int res=1,curLen=1,pos=-1,leftBound=0;
        HashMap<Character,Integer> charSet  = new HashMap<Character,Integer>();
        charSet.put(s.charAt(0),0);
        for(int i=1;i<s.length();i++){
            char curChar =s.charAt(i);
            if(charSet.containsKey(curChar)){
               pos = charSet.get(curChar);
               for(int j=leftBound;j<pos;j++){
                   charSet.remove(s.charAt(j));
               }
               leftBound = pos+1;
               curLen =i-pos;
               charSet.put(curChar,i);
            }
            else{
                 charSet.put(curChar,i);
                 curLen++;
                 res=Math.max(res,curLen);
            }
        }
        return res;
    }
}


