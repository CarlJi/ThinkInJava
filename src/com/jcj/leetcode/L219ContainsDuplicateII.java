package com.jcj.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L219ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> kv = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; i++)
        {
            if(kv.containsKey(nums[i]))
            {
                if ((i - kv.get(nums[i])) <= k)
                {
                    return true;
                }
            }
            kv.put(nums[i], i);
        }
        
        return false;
    }
    
    /**
     * Refer: https://leetcode.com/discuss/38445/simple-java-solution
     * 
     * Use Set more effciency than HashMap
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate_2(int[] nums, int k)
    {
    	Set<Integer> results = new HashSet<Integer>();
    	
    	for(int i = 0; i < nums.length; i++)
    	{
    		if(i>k) results.remove(nums[i-k-1]);
    		if(!results.add(nums[i])) return true;
    	}
    	return false;
    }
    
}
