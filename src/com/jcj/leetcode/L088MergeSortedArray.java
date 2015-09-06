package com.jcj.leetcode;

public class L088MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int A[], int m, int B[], int n) {
        int k =0, v =0;
        while(k<m&&v<n)
        {
            if(B[v]<A[k])
            {
                int temp = m;
                while(temp-1 >= k)
                {
                    A[temp] =A[temp-1];
                    temp--;
                }
                m ++;
                A[k]=B[v];
                v++;
                k++;
            }
            else
            {
                k++;
            }
        }
        
        while(k>=m && v<n)
        {
            A[k]=B[v];
            k++;
            v++;
        }
	}
	
	/**
	 * Refer: https://leetcode.com/discuss/31675/share-my-accepted-java-solution
	 * 
	 * 从数组的尾部赋值!!
	 * 
	 * @param A
	 * @param m
	 * @param B
	 * @param n
	 */
	public void merge_2(int A[], int m, int B[], int n)
	{
		int i = m -1, j = n -1, k = m+n-1;
		
		while(i >=0 && j >=0)
		{
			A[k--] = (A[i]>B[j]?A[i--]:B[j--]);
		}
		
		while( j>=0)
		{
			A[k--] = B[j--];
		}
	}

}
