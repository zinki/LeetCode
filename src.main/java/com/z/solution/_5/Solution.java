package com.z.solution._5;

public class Solution {
    public static String longestPalindrome(String s) {
        String str = "";
        for(int index = 0;(s.length()-index)>str.length();index++){
            int i = s.length();
            while((i-index)>str.length()){
                String substring = s.substring(index, i);
                if(check(substring)){
                    str = substring;
                    break;
                }
                i--;
            }
        }
        return str;
    }

    public static boolean check(String s){
        int right=s.length()-1 ;
        int left=0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("babad"));
    }
}
