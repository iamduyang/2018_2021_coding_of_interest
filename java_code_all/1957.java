class Solution {
    public String makeFancyString(String s) {
        if(s==null|s.length()<3)
            return s;
        
        StringBuffer res= new StringBuffer(s.substring(0,2));
        int count=1;char curChar = s.charAt(1);
        if(s.charAt(0)==s.charAt(1))
            count=2;
        for(int i=2;i<s.length();i++){
            if(s.charAt(i)==curChar){
                if(count==1){
                    count=2;
                    res.append(s.charAt(i));
                }
                
            }
            else{
                curChar = s.charAt(i);
                count=1;
                 res.append(s.charAt(i));
            }

        }
        return res.toString();
    }
}





