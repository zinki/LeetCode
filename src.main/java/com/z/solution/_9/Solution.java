package com.z.solution._9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isPalindrome(int x) {
        List<Integer> list = new ArrayList<>();
        if(x < 0){
            return false;
        }
        if(x/10<0){
            return true;
        }
        while (x > 0){
            list.add(x%10);
            x = x/10;
        }
        for(int index = 0;index<=list.size()/2-1;index++){
            if(list.get(index)!= list.get(list.size()-1-index)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12210));
    }
}
