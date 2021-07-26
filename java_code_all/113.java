


class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    	List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    	if(root==null)
    		return returnList;
    	if(root.left==null&&root.right==null&&targetSum!=root.val)
    		return returnList;
    	if(root.left==null&&root.right==null&&targetSum==root.val){
    		List<Integer> thisList = new ArrayList<Integer>();
    		thisList.add(root.val);
    		
    		returnList.add(thisList);
    		return returnList;
    	}
    	List<List<Integer>> leftReturn =pathSum(root.left,targetSum-root.val);
    	List<List<Integer>> rightReturn = pathSum(root.right,targetSum-root.val);
    	
    	
	    	for(int i=0;i<leftReturn.size();i++){
	    		List<Integer> tempList = new ArrayList<Integer>();
	    		tempList.add(root.val);
	    		tempList.addAll(leftReturn.get(i));
	    		returnList.add(tempList);
	    	}
   
   
	    	for(int i=0;i<rightReturn.size();i++){
	    		List<Integer> tempList = new ArrayList<Integer>();
	    		tempList.add(root.val);
	    		tempList.addAll(rightReturn.get(i));
	    		returnList.add(tempList);
	    	}

    	return returnList;
    		
    }
}


