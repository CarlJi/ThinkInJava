package com.jcj.leetcode;

public class L111MinimumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * 
	 * I forgot:
	 * 1. [1,2]
	 * 2. [1,2,null,3,null,4,null,5]
	 * 
	 * Then refer: https://leetcode.com/discuss/25060/my-4-line-java-solution
	 * 
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);

		return left==0||right==0 ? left+right+1:1+ Math.min(left,right);
	}

}
