package com.z.solution._1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int x=0;x<nums.length;x++){
            for(int y=0;y<nums.length && x!=y;y++){
                if((nums[x]+nums[y])==target){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{};
    }
}
