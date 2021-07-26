class Solution {
    public int minDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	if(root.left==null)
    		return 1+minDepth(root.right);
    	else if(root.right==null)
    		return 1+minDepth(root.left);
    	int leftDepth =minDepth(root.left),
    			rightDepth=minDepth(root.right);
    	return (rightDepth>leftDepth)?(1+leftDepth):(1+rightDepth);
    }
}



