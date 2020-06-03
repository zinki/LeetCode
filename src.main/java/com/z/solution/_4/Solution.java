package com.z.solution._4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> list = new ArrayList<>();
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        while (i<nums1.length || j< nums2.length){
            if(i>=nums1.length){
                setList(nums2[j++]);
                continue;
            }
            if(j>=nums2.length){
                setList(nums1[i++]);
                continue;
            }
            if(nums1[i]>nums2[j]){
                setList(nums2[j++]);
            }else {
                setList(nums1[i++]);
            }
        }
        if(list.size() %2==0){
            return (list.get((list.size())/2-1) + list.get(list.size()/2))*1.0/2;
        }else {
            return list.get((list.size()+1)/2-1);
        }
    }

    public static void setList(int value){
        if(list.size() == 0){
            list.add(value);
        }else {
            if (list.get(list.size() - 1) <= value) {
                list.add(value);
            } else {
                Integer integer = list.remove(list.size() - 1);
                list.add(value);
                list.add(integer);
            }
        }
    }

    public static void main(String[] args){
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}
