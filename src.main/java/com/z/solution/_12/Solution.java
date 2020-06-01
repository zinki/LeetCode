package com.z.solution._12;

public class Solution {
    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] subs = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] keys = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        while (num>0){
            for(int index = subs.length-1;index>=0;index--){
                if(num >= subs[index]) {
                    num -= subs[index];
                    stringBuilder.append(keys[index]);
                    index++;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(intToRoman(3));
    }
}
