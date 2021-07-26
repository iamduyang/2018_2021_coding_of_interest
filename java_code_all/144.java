class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    	ArrayList<Integer> returnList = new ArrayList<Integer>();
    	if(root==null)
    		return returnList;
    	returnList.add(root.val);
    	
    	 
    	returnList.addAll(preorderTraversal(root.left));
    	returnList.addAll(preorderTraversal(root.right));
    	return returnList;
    }
}


