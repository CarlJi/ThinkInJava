package com.carl.sort;

import java.util.List;

import com.carl.util.Util;


public class ShellSort {

	public static void main(String[] args) {

		List<Integer> ls = Util.getRandomList(100);

		long begin = System.nanoTime();
		//insertSort(ls);

		shellSort_2(ls);
		long end = System.nanoTime();

		System.out.println("Time:" + (end - begin) / 1000);

		Util.printList(ls);

	}


	/**
	 * Refer: http://blog.csdn.net/morewindows/article/details/6668714
	 * 希尔排序的实质就是分组插入排序，该方法又称缩小增量排序，因DL．Shell于1959年提出而得名。
	 * 该方法的基本思想是：
	 * 先将整个待排元素序列分割成若干个子序列（由相隔某个“增量”的元素组成的）分别进行直接插入排序，
	 * 然后依次缩减增量再进行排序，待整个序列中的元素基本有序（增量足够小）时，再对全体元素进行一次直接插入排序。
	 * 因为直接插入排序在元素基本有序的情况下（接近最好情况），效率是很高的，因此希尔排序在时间效率上比前两种方法有较大提高。
	 * 
	 * @param ls
	 */
	public static void shellSort_1(List<Integer> ls)
	{
		for(int step = ls.size() /2; step >=1 ; step = step /2)
		{
			for(int i = 0; i < step; i++)
			{
				for(int j = i + step; j < ls.size() ; j = j + step)
				{
					int temp = ls.get(j);
					int k;
					for(k = j - step; k >= 0 && ls.get(k) > temp; k = k - step)
					{
						ls.set(k + step, ls.get(k));
					}
					ls.set(k+step, temp);
				}
			}
		}
	}
	/**
	 * 	/**
	 * 优化 shellSort_1, 从代码上看,少了一层循环
	 * Refer:http://www.cnblogs.com/huangxincheng/archive/2011/11/20/2255695.html
	 *
	 * @param ls
	 */
	public static void shellSort_2(List<Integer> ls)
	{
		int step = ls.size() /2;
		while(step >=1)
		{
			for(int i = step; i < ls.size(); i ++)
			{
				int temp = ls.get(i);
				int j;
				for(j = i - step; j >= 0 && ls.get(j) > temp; j = j - step)
				{
					ls.set(j + step, ls.get(j));
				}
				ls.set(j + step, temp);
			}

			step /=2;
		}
	}

}
