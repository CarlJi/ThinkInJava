package com.carl.sort;

import java.util.ArrayList;
import java.util.List;

import com.carl.util.Util;

public class MergeRelatedSort {
	
	public static void main(String... args)
	{
		List<Integer> ls1 = Util.getRandomList(4);
		List<Integer> ls2 = Util.getRandomList(5);
		
		HeapRelatedSort.HeapSort(ls1);
		HeapRelatedSort.HeapSort(ls2);
		
		System.out.println("ls1: =========");
		Util.printList(ls1);
		
		System.out.println("ls2: =========");
		Util.printList(ls2);
		
		List<Integer> ls3 = new ArrayList<Integer>();
		
		mergeTwoArrays(ls1, ls2, ls3);
		
		System.out.println("ls3: ==========");
		Util.printList(ls3);
	}
	
	/**
	 * ls1 = 71, 420, 441, 446, 463, 498, 634, 686
	 * ls2 = 173, 184, 259, 356, 387, 394, 415, 487, 507, 517, 710, 964
	 * 
	 * Step 1: 
	 * 
	 * @param ls1
	 * @param ls2
	 * @param res
	 */
	public static void mergeTwoArrays(List<Integer> ls1, List<Integer> ls2, List<Integer> res)
	{
		int k = 0, v = 0;
		
		while(k < ls1.size() && v < ls2.size())
		{
			if(ls1.get(k) < ls2.get(v))
			{
				res.add(ls1.get(k++));
			}
			else
			{
				res.add(ls2.get(v++));
			}
		}
		
		while(k < ls1.size())
			res.add(ls1.get(k++));
		
		while(v < ls2.size())
			res.add(ls2.get(v++));
		
	}
	
	/**
	 * 其的基本思路就是将数组分成二组A，B，如果这二组组内的数据都是有序的，那么就可以很方便的将这二组数据进行排序。
	 * 如何让这二组组内数据有序了？
	 * 可以将A，B组各自再分成二组。依次类推，
	 * 当分出来的小组只有一个数据时，可以认为这个小组组内已经达到了有序，然后再合并相邻的二个小组就可以了。
	 * 这样通过先递归的分解数列，再合并数列就完成了归并排序。
	 * @param ls
	 */
	public static void mergeSort(List<Integer> ls)
	{
		
	}

}
