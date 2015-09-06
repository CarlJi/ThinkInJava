package com.jcj.jzoffer;

import com.carl.util.Util;

public class SortAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] res = Util.getRandomArray(100, 10000);
		
		sortAge(res);
		
		Util.printArray(res);
	}
	
	public static void sortAge(int[] ages)
	{
		int[] agesCount = new int[100];
		
		for(int i =0; i< ages.length; i++)
		{
			agesCount[ages[i]] = agesCount[ages[i]] +1;
		}
		int index=0;
		for(int i =0; i< 100; i++)
		{
			for(int j=0; j<agesCount[i]; j++)
			{
				ages[index]=i;
				index++;
			}
		}
	}

}
