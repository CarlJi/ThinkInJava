package com.carl.tree;

public class BuildTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode doBuildTree(int[] preorder, int[] inorder, int start, int end)
	{
		if(start <= end)
		{
			TreeNode head = new TreeNode(preorder[start]);

			int target = -1;
			for(int i = 0; i < inorder.length; i++)
			{
				if(inorder[i] == preorder[start])
				{
					target = i;
					break;
				}
			}

			head.left = doBuildTree(preorder, inorder, start+1, target -1);
			head.right = doBuildTree(preorder, inorder, target+1, end);

			return head;
		}
		else
		{
			return null;
		}
	}

}
