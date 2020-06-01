package com.z.solution._15;

import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lists = new HashSet<>();
        Arrays.sort(nums);
        for(int x = 0;x<nums.length;x++){
            for(int y = x+1;y<nums.length;y++) {
                if(nums[x] + nums[y] > 0){
                    continue;
                }
                int search = Arrays.binarySearch(nums,y+1,nums.length, -(nums[x] + nums[y]));
                if(search>0 && search < nums.length){
                    List<Integer> list = Arrays.asList(nums[x],nums[y],nums[search]);
                    Collections.sort(list);
                    lists.add(list);
                }
            }
        }
        return new ArrayList<>(lists);
    }

    public static void main(String[] args){
        int[] i =  new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(i));
    }
}
