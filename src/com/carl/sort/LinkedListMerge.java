package com.carl.sort;

public class LinkedListMerge {

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(1);
		
		Node<Integer> current=node1;
		for(int i = 1; i < 10 ; i++)
		{
			Node<Integer> temp=new Node<Integer>(2*i);
			current.next=temp;
	        current=current.next;
			
		}
		current=node2;
		for(int i = 1; i < 20 ; i++)
		{
			Node<Integer> temp=new Node<Integer>(2*i+1);
			current.next=temp;
	        current=current.next;
			
		}
		
		System.out.print("Node1:");
		
		printLinkedList(node1);
		
		System.out.print("Node2:");
		printLinkedList(node2);
		
		//Node<Integer> node3 = new Node<Integer>();
		
		//Node<Integer> node3 = mergeLinkedList(node1, node2);
		
		//System.out.print("Node3:");
		//printLinkedList(node3);

	}
	public static <T> void printLinkedList(Node<T> node)
	{
		Node<T> current = node;
		while(current != null)
		{
			System.out.print(current.item + "  ");
			current = current.next;
		}
		
		System.out.println();
	}
	
	private static class Node<E> {
		E item;
		Node<E> next;
		
		Node(E element)
		{
			this.item = element;
		}
		
		Node()
		{
			
		}
	}
	
	/**
	 * Merge two linked list into one
	 * 
	 * @param ll1
	 * @param ll2
	 * @param result
	 */
	public static <E extends Comparable<E>> void mergeLinkedList(Node<E> ll1, Node<E> ll2, Node<E> result )
	{
		Node<E> head = result;
		Node<E> temp;
		while(ll1.next != null && ll2.next != null)
		{
			if(ll1.item.compareTo(ll2.item) < 0)
			{
				temp = new Node<E>(ll1.item);
			   	head.next = temp;
			   	head = head.next;
			   	ll1 = ll1.next;
			}
			else
			{
				temp = new Node<E>(ll2.item);
				head.next = temp;
				head = head.next;
				ll2 = ll2.next;
			}
		}
		
		if(ll1.next != null)
		{
			head.next = ll1.next;
		}
		
		if(ll2.next != null)
		{
			head.next = ll2.next;
		}
	}
}
