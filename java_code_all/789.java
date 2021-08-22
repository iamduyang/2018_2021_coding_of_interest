class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        if(ghosts==null||target==null)
            return true;
        int steps=Math.abs(target[0])+Math.abs(target[1]),tempDistance=0;
        for(int[] cur:ghosts){
            tempDistance=countDistance(cur,target);
            if(tempDistance<=steps)
                return false;
        }
        return true;



    }
    public int countDistance(int[] current,int[] target){
        return Math.abs(current[0]-target[0])+Math.abs(current[1]-target[1]);
    }
}

