package com.z.solution._8;

public class Solution {
    public static int myAtoi(String str) {
        StringBuilder result = new StringBuilder();
        int signature = 1;
        boolean flag = false;
        for (int index = 0;index<str.length();index++){
            char c = str.charAt(index);
            if(c == 32 || c == 45 || c == 43) {
                if(flag) {
                    break;
                }else {
                    if(c == 45){
                        signature = -1;
                    }
                    if(c != 32){
                        flag = true;
                    }
                    continue;
                }
            }
            if(c <48 || c >57){
                break;
            }
            flag = true;
            result.append(c);
        }
        long value = 0;
        for(int index = 0;index<result.length();index++){
            value += signature * (result.charAt(index)-48) * Math.pow(10,result.length()-1-index);
            if(signature >0){
                if(value > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }else {
                if(value < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)value;
    }

    public static void main(String[] args){
        System.out.println(myAtoi("0-1"));
    }
}
