package com.jcj.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class L101SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Refer: https://leetcode.com/discuss/33397/simple-java-recursive-solution
	 * 
	 * @param root
	 * @return
	 */
	public static boolean isSymmetric(TreeNode root) {
       if(root == null) return true;
       return isSymmetric(root.left, root.right);
	}
	
	private static boolean isSymmetric(TreeNode left, TreeNode right)
	{
		if(left == null && right==null) return true;
		if(left == null || right== null) return false;
		
		return left.val == right.val && isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left);
	}
	
	/**
	 * Refer: https://leetcode.com/discuss/32079/not-sure-if-this-is-a-good-iterative-solution
	 * 
	 * @param root
	 * @return
	 */
	public boolean isSymmetric_2(TreeNode root)
	{
		  
	       if(root == null) return true;
	       
	       if(root.left != null ^ root.right != null) return false;
	       
	       Queue<TreeNode> q = new LinkedList<TreeNode>();
	       
	       if(root.left != null)
	       {
	       q.add(root.left);
	       q.add(root.right);
	       }
	       
	       while(!q.isEmpty())
	       {
	           TreeNode out1 = q.poll();
	           TreeNode out2 = q.poll();
	           
	           if(out1.val != out2.val) return false;
	           
	           if((out1.left != null ^ out2.right != null) || (out1.right!=null ^ out2.left!=null)) return false;
	           if(out1.left != null) {
	               q.add(out1.left);
	               q.add(out2.right);
	           }
	           
	           if (out1.right!= null){
	               q.add(out1.right);
	               q.add(out2.left);
	           }
	       }
	       
	       return true;
	       
		
	}

}
