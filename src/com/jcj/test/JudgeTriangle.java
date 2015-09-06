package com.jcj.test;

import java.util.concurrent.ConcurrentHashMap;

public class JudgeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	enum Triangle
	{
		ONE("Normal triangles"),
		TWO("Both edges are equals"),
		THREE("All edges are equals"),
		FOUR("Right triangles"); //?
		
		String des; 
		
		Triangle(String value)
		{
			this.des = value;
		}
		
	}
	
	public static Triangle isTriangle(int s1, int s2, int s3)
	{
		if( s1>0 && s2>0 && s3 >0)
		{
			if(s1+s2 > s3 && s1+s3 > s2 && s3+s2 > s1)
			{
				if(s1==s2 || s2==s3 || s1==s3)
				{
					if(s1==s2 && s2==s3)
					{
						return Triangle.THREE;
					}
					else
					{
						return Triangle.TWO;
					}
				}
				else
				{
					return Triangle.ONE;
				}
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}

}
