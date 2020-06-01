package com.z.solution._7;

public class Solution {
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        long l = x;
        if(l<0){
            l = -l;
            stringBuilder.append("-");
        }
        while (l/10>0){
            stringBuilder.append(l%10);
            l = l/10;
        }
        stringBuilder.append(l%10);
        Long value = Long.valueOf(stringBuilder.toString());
        if(value >Integer.MAX_VALUE || value < Integer.MIN_VALUE){
            return 0;
        }
        return value.intValue();
    }

    public static void main(String[] args){
        System.out.println(reverse(-2147483648));
    }
}
