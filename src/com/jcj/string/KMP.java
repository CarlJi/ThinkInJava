package com.jcj.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer to: http://kb.cnblogs.com/page/176818/
 * 
 * @author Carl Ji
 *
 */
public class KMP {

	public static void main(String... args)
	{
		System.out.println("KMP:");
		KMP kmp = new KMP();
		String src = "abcdefhhjjfct ghpgp ipgpd";
		String target = "gp";
		src.contains(target);
		
		List<Integer> list = kmp.getPartialMatchTable(target);
		for(int i = 0 ; i < target.length(); i ++)
		{
			System.out.println(list.get(i)+"");
		}
		
		System.out.println("After kmp searhc:");
		System.out.println(kmp.searchString(src, target));

	}

	public int searchString(String src, String target)
	{
		if(src == null || target == null)
		{
			return -1;
		}

		List<Integer> pt = getPartialMatchTable(target);


		int m = 0;

		while(m < src.length())
		{
			int i = 0;
			for(; i < target.length(); i++)
			{
				if(src.charAt(m+i) != target.charAt(i))
				{
					if(i != 0)
					{
						m = m + (i -1 - pt.get(i -1));
					}
					break;
				}
			}

			if( i == target.length())
			{
				return m;
			}
			else
			{
				m++;
			}

		}



		return -1;
	}

	public List<Integer> getPartialMatchTable(String str)
	{
		List<Integer> partialMatchTable = new ArrayList<Integer>();

		StringBuilder key = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			key.append(str.charAt(i));
			partialMatchTable.add(calcPartiaMatchTable(key.toString()));
		}

		return partialMatchTable;
	}

	private int calcPartiaMatchTable(String str)
	{
		if(str == null)
		{
			return -1;
		}
		if(str.length() == 1)
		{
			return 0;
		}


		return getLongestKey(getPrefixStrings(str), getSubffixStrings(str));
	}

	private List<String> getPrefixStrings(String str)
	{
		List<String> result = new ArrayList<String>();
		StringBuilder prefix = new StringBuilder();
		for(int i = 0; i < str.length() - 1; i++)
		{
			prefix.append(str.charAt(i));

			result.add(prefix.toString());
		}

		return result;
	}

	private List<String> getSubffixStrings(String str)
	{

		List<String> tempSB = new ArrayList<String>();
		for(int i = 1 ; i < str.length() ; i ++)
		{
			tempSB.add(str.substring(i));
		}

		return tempSB;
	}

	private int getLongestKey(List<String> strOne, List<String> strTwo)
	{
		for(int i = 0; i < strTwo.size(); i ++)
		{
			if(strTwo.get(i).equals(strOne.get(strOne.size() - 1 - i)))
			{
				return strTwo.get(i).length();
			}
		}


		return 0;
	}
}
