package com.jcj.leetcode;

public class L100SameTree {

	public static void main(String[] args) {

	}
	
	/**
	 * Refer:https://leetcode.com/discuss/3470/seeking-for-better-solution 
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	  if(p == null && q == null)
          {
              return true;
          }
          else if (p==null || q==null||p.val!=q.val)
          {
              return false;
          }
          else
          {
              return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
          }
    }

}
