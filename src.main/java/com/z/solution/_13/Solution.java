package com.z.solution._13;

import java.util.HashMap;

public class Solution {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("M",1000);
        hashMap.put("D",500);
        hashMap.put("C",100);
        hashMap.put("L",50);
        hashMap.put("X",10);
        hashMap.put("V",5);
        hashMap.put("I",1);
        for(int index = 0;index<chars.length-1;index++){
            String c = String.valueOf(chars[index]);
            Integer value = hashMap.get(c);
            if(value < hashMap.get(String.valueOf(chars[index+1]))){
                i += -value;
            }else {
                i += value;
            }
        }
        i += hashMap.get(String.valueOf(chars[chars.length-1]));
        return i;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
}
