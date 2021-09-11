class Solution {
    public int fib(int n) {
        if(n<2)
            return n;
        
        int a_1=1,a=1,sum=1;
        for(int i=2;i<n;i++){
            
            sum=a_1+a;
            if(sum>1000000007)
                sum=sum%1000000007;
            a_1=a;
            a=sum;
            
        }
        return a;
    }
}

