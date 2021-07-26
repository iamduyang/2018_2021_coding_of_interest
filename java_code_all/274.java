class Solution {
    public int hIndex(int[] citations) {
        if(citations==null|| citations.length<1)
            return 0;
        Arrays.sort(citations);
        int citaLength = citations.length,hI = 0,candidate=0;
        for (int i=0;i<citaLength;i++){
            candidate=Math.min(citations[i],citaLength-i);
            hI=Math.max(hI,candidate);
            if(hI>(citaLength-i))
                break;
        }
        return hI;
    }
}



