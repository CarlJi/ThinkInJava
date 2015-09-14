package com.carl.tree;

import java.util.ArrayList;
import java.util.List;

public class SecondKMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(2);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);

		// right
		node.right = new TreeNode(4);
		node.right.left=new TreeNode(4);

		findSecondKMazNumber(node, 2);
	}

	/**
	 * Questions: 有这样一颗二叉树，它是有序的，也就是类似于二叉搜索树，
	 * 但是有一个条件，给定一个节点A，A的左子树的根节点的值小于等于A的值，
	 * A的右子树的根节点的值大于等于A的值，（特点就是节点值可以相等），
	 * 那么在中序遍历中，树的值应该是有序的对吧？假设遍历的结果是1,2,2,3,4,4，
	 * 现在给你一个树的根节点的指针，给定一个关键值K，
	 * 求序列中值等于K的第二个树节点的指针，如果不存在返回NULL即可
	 * 
	 * URL:http://www.cnblogs.com/sjinsa/p/4796963.html 
	 * 
	 * @param node
	 * @return
	 */
	public static void findSecondKMazNumber(TreeNode node, int target)
	{
		if(node == null)
		{
			return;
		}

		List<TreeNode> nodes = new ArrayList<TreeNode>();
		findAllNodesWithTargetValue(node, target, nodes);

		if(nodes.size() <2)
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println(nodes.get(1).val);
			System.out.println(nodes.get(1).left.val);
			System.out.println(nodes.get(1).right.val);
		}
	}

	private static void findAllNodesWithTargetValue(TreeNode node, int k, List<TreeNode> list)
	{
		if(node == null)
		{
			return;
		}

		if(node.val == k)
		{
			findAllNodesWithTargetValue(node.left, k, list);
			list.add(node);
			findAllNodesWithTargetValue(node.right, k, list);
		}
		else if(node.val > k)
		{
			findAllNodesWithTargetValue(node.left, k, list);
		}
		else if(node.val < k)
		{
			findAllNodesWithTargetValue(node.right, k, list);
		}
	}

}
