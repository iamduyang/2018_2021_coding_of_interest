class Solution {
    public int maxDepth(TreeNode root) {
    	if(root==null)return 0;
    	int leftDep=maxDepth(root.left),
    			rightDep=maxDepth(root.right);
    	
    	return 1+(leftDep>rightDep?leftDep:rightDep);
    }
}


