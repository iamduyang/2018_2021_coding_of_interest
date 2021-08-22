class Solution {
    public int maximumPopulation(int[][] logs) {
        if(logs==null)
            return 0;
        int lenLog=logs.length;
        int[] yearsNum =new int[101];
        for(int i=0;i<lenLog;i++){
        	int begin=logs[i][0]-1950,end =logs[i][1]-1950 ;
        	
        	for(int jj=begin;jj<end;jj++)
        		yearsNum[jj]++;
            
        }
        int maxNum = yearsNum[0];;
        for(int i=1;i<yearsNum.length;i++ )
            maxNum=Math.max(maxNum,yearsNum[i]);
        int res=0;
        
        for(;res<yearsNum.length;res++){
            if(yearsNum[res]==maxNum){
            	
                return res+1950;
            }
        }
        return res;
    }
}


