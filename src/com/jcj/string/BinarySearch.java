package com.jcj.string;

/**
 * http://www.algolist.net/Algorithms/Binary_search
 * 
 * @author Carl Ji
 *
 */
public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		int[] src = {-7, 2,3,4, 7, 9, 11, 12 ,45, 67, 89};
		int target = -17;

		System.out.println("" + bs.binarySearchRecurise(src, target, 0 , src.length - 1) );

	}

	public int binarySearch(int[] src, int target)
	{
		int left = 0;
		int right = src.length -1;
		while (left < right)
		{
			int mid = (left + right )/2;
			if(src[mid] < target)
			{
				left = mid+1;
			}
			else if (src[mid] > target)
			{
				right = mid-1;
			}
			else
			{
				return mid;
			}
		}

		if(src[left] == target)
		{
			return left;
		}

		return -1;
	}

	public int binarySearchRecurise(int[] src, int target, int left, int right)
	{
		if(left > right)
		{
			return -1;
		}

		int mid = (left + right)/2;
		if(src[mid] == target)
		{
			return mid;
		}
		else if (src[mid] > target)
		{
			return binarySearchRecurise(src, target, left, mid - 1);
		}
		else
		{
			return binarySearchRecurise(src, target, mid + 1, right);
		}
	}

}
