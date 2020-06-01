package com.z.solution._14;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String commonPrefix = getCommonPrefix(strs[0],strs[1]);
        if(strs.length == 2){
            return commonPrefix;
        }
        if(commonPrefix == ""){
            return commonPrefix;
        }
        for(int index = 2;index<strs.length;index++){
            commonPrefix = getCommonPrefix(commonPrefix,strs[index]);
        }
        return commonPrefix;
    }

    private static String getCommonPrefix(String str1,String str2){
        StringBuilder stringBuilder = new StringBuilder();
        for(int index = 0;index<str1.length() && index<str2.length();index++){
            if(str1.charAt(index) != str2.charAt(index)){
                break;
            }
            stringBuilder.append(str1.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"baab","bacb","b","cbc"})) ;
    }
}
