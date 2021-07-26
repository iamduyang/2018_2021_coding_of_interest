class Solution {
    public boolean isUgly(int n) {
        if(n<1)
        	return false;
        if(n==1)
            return true;
        while(n>2&&n%2==0)
        	n=n>>1;
        while(n>3&&n%3==0)
        	n=n/3;
        while(n>5&&n%5==0)
        	n=n/5;
        if(n==5||n==3||n==2)
        	return true;
        return false;
    }
}


