class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
    	if(root==null)
    		return returnList;
    	
    	
    	
    	returnList.addAll(postorderTraversal(root.left));
    	returnList.addAll(postorderTraversal(root.right));
        returnList.add(root.val);
    	return returnList;
    }
}

