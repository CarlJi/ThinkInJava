package com.carl.sort;

import java.util.List;

import com.carl.util.Util;

public class HeapRelatedSort {

	public static void main(String[] args) {

		List<Integer> arr = Util.getRandomList(10);

		HeapSort(arr);

		for (int i = 0; i < arr.size(); i++)
		{
			System.out.println("" + arr.get(i));
		}
	}

	public static void HeapSort(List<Integer> src)
	{
		if(src != null)
		{
			buildMaxHeap(src, src.size());

			for(int i = src.size() - 1; i >0; i --)
			{
				int temp = src.get(i);
				src.set(i, src.get(0));
				src.set(0, temp);
				buildMaxHeap(src, i);
			}
		}
	}

	public static void buildMaxHeap(List<Integer> src, int length)
	{
		int start = getParentIndex(length - 1);
		for(int i = start; i >= 0; i --)
		{
			maxHeapify(src, i,  length);
		}
	}

	public static void maxHeapify(List<Integer> src, int index, int length)
	{
		int leftChild = getLeftChildIndex(index);
		int rightChild = getRightChildIndex(index);

		int largest = index;
		if(leftChild < length && src.get(leftChild) > src.get(largest))
			largest = leftChild;
		if(rightChild < length && src.get(rightChild) > src.get(largest))
			largest = rightChild;

		if(largest != index)
		{
			int temp = src.get(index);
			src.set(index, src.get(largest));
			src.set(largest, temp);
			maxHeapify(src, largest, length);
		}
	}

	private static int getParentIndex(int current)
	{
		return (current - 1) >> 1;
	}

	private static int getLeftChildIndex(int current)
	{
		return (current << 1)+1;
	}

	private static int getRightChildIndex(int current)
	{
		return (current << 1) + 2;
	}

}
