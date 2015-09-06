package com.jcj.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class L215KthLargestElementinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,-2,3,-4,5};
		
		System.out.println(findKthLargest_1(nums, 1));
	}
	
	/**
	 * Refer:https://leetcode.com/discuss/36966/solution-explained
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
    public static int findKthLargest_2(int[] nums, int k) {
        
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	
    	for(int i = 0; i < nums.length; i++)
    	{
    		pq.add(nums[i]);
    		if(pq.size() > k)
    		{
    			pq.poll();
    		}
    	}
    	
    	return pq.peek();
    }
    
    public static int findKthLargest_1(int[] nums, int k) {
    	if(nums == null || nums.length < 1) return Integer.MIN_VALUE;
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    
    /**
     * Refer:https://leetcode.com/discuss/36991/java-quick-select
     * 
     * 
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest_3(int[] nums, int k) {
        return 0;
    }

}
