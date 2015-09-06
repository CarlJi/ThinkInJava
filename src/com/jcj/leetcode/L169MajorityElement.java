package com.jcj.leetcode;

import java.util.Arrays;

public class L169MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
