package com.carl.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Node<E> root;
	
	
	
	
	private static class Node<E> {
		E item;
		Node<E> left;
		Node<E> right;
	}
	
	/**
	 * Lookup the data from binary tree 
	 * 
	 * @param tree
	 * @param data
	 * @return
	 */
	public Node<E> lookup(Node<E> tree, E data)
	{
		if(tree == null)
			return null;
		
		if(tree.item.equals(data))
		{
			return tree;
		}
		
		Node<E> leftResult = lookup(tree.left, data);
		Node<E> rightResult = lookup(tree.right, data);
		
		return leftResult == null ? rightResult:leftResult;
	}
	
	/**
	 * Get the length of binary tree
	 * 
	 * @param node
	 * @return
	 */
	public int length(Node<E> node)
	{
		
		if(node == null)
		{
			return 0;
		}
		
		int leftLength = length(node.left);
		int rightLength = length(node.right);
		
		if(leftLength > rightLength)
		{
			return leftLength + 1;
		}
		else
		{
			return rightLength + 1;
		}
	}
	
	/**
	 * 
	 * @param node
	 */
	public void DLR(Node<E> node)
	{
		if(node == null)
		{
			return;
		}
		
		System.out.println(node.item +"\t");
		
		DLR(node.left);
		DLR(node.right);
	}
	
	public void LDR(Node<E> node)
	{
		if(node == null)
		{
			return;
		}
		
		LDR(node.left);
		
		System.out.println(node.item + "\t");
		LDR(node.right);
	}
	
	public void LRD(Node<E> node)
	{
		if(node == null)
		{
			return;
		}
		
		LDR(node.left);
		LDR(node.right);
		System.out.println(node.item + "\t");
	}
	
	/**
	 * Refer:http://stackoverflow.com/questions/2241513/java-printing-a-binary-tree-using-level-order-in-a-specific-format
	 * 
	 * 相当于广度优先搜索，使用队列实现。
	 * 队列初始化，将根节点压入队列。
	 * 当队列不为空，进行如下操作：
	 * 弹出一个节点，访问，若左子节点或右子节点不为空，将其压入队列。
	 * @param node
	 */
	public void levelTraverse(Node<E> node)
	{
		if(node == null)
		{
			return;
		}
		
		Queue<Node<E>> level = new LinkedList<Node<E>>();
		level.add(node);
		while(!level.isEmpty())
		{
			Node<E> tempNode = level.poll();
			System.out.println(tempNode.item + "");
			level.add(tempNode.left);
			level.add(tempNode.right);
		}
	}
	

}
