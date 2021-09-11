class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(limit<1||people.length<1)
            return 0;
        Arrays.sort(people);
        int lenPeople = people.length;
        int left=0,right=lenPeople-1,res=0;
        while(left<right){
            if((people[left]+people[right])<=limit){
                res++;
                left++;
                right--;
            }
            else{
                right--;
                res++;
            }
        }
        if(left==right)
            res++;
        return res;
    }
}




