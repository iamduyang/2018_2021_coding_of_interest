class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk==null||k<1)
            return -1;
        long sum = 0;
        for(int i:chalk){
            sum+=i;
        }
        int remain =  (int)((long)k%sum);
        int res=0;
        
        for(;res<chalk.length;res++){
            remain-=chalk[res];
            if(remain<0)
                break;
        }
        return res;
    }
}


