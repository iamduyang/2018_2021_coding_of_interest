class Solution {
    public boolean isBalanced(TreeNode root) {
    	if(root==null)
    		return true;
    	if(root.right==null&&root.left==null)
    		return true;
    	if (Math.abs(treeDepth(root.left)-treeDepth(root.right))>1)
    		return false;
    	return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int treeDepth(TreeNode root){
    	if(root==null)
    		return 0;
    	int depthLeft=treeDepth(root.left),
    		depthRight = treeDepth(root.right);
    	return 1+(depthLeft>depthRight?depthLeft:depthRight);
    }
}


