package com.z.solution._35;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        for(int index=nums.length-1;index>=0;index--){
            if(nums[index] < target){
                return index+1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }
}
