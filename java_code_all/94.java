class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	LinkedList<Integer> outList = new LinkedList<Integer>();
    	if(root==null)
    		return outList;
    	List<Integer> leftList = inorderTraversal(root.left);
    	List<Integer> rightList = inorderTraversal(root.right);

    	
    	if(leftList!=null)
    		for(int i=0;i<leftList.size();i++)
    			outList.add(leftList.get(i));
    	outList.add(root.val);
    	if(rightList!=null)
    		for(int i=0;i<rightList.size();i++)
    			outList.add(rightList.get(i));
    	return outList;
    }
    
}

