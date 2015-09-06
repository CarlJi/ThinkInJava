package com.jcj.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L217ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums.length; i++)
        {
            if(resultMap.containsKey(nums[i]))
            {
                return true;
            }
            resultMap.put(nums[i],true);
        }
        return false;
    }
    
    /**
     * Refer:https://leetcode.com/discuss/37219/possible-solutions
     * 
     * Use Set
     * @param nums
     * @return
     */
    public boolean containsDuplicate_2(int[] nums)
    {
    	Set<Integer> resultSet = new HashSet<Integer>();
    	for(int value: nums)
    	{
    		if(!resultSet.add(value))
    			return true;
    	}
    	
    	return false;
    }

}
