class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()<1)
            return s;
        String[] strArray = s.split(" ");

        String resStr = reverseStr(strArray[0]);
        for(int i=1;i<strArray.length;i++)
            resStr+=" "+reverseStr(strArray[i]);
        return resStr;
    }
    public String reverseStr(String inStr){
        String res = "";
        for(int i=inStr.length()-1;i>=0;i--)
            res+=inStr.charAt(i);
        return res;

    }
}

