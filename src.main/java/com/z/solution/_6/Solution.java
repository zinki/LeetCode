package com.z.solution._6;

public class Solution {
    public static String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        int t = 1;
        int j = 0;
        for(int index = 0;index<s.length();index++){
            if(j == 0){
                t= 1;
            }
            if(j == numRows-1){
                t = -1;
            }
            if(null == stringBuilders[j]){
                stringBuilders[j] = new StringBuilder();
            }
            stringBuilders[j].append(s.charAt(index));
            j += t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            stringBuilder.append(stringBuilders[i] == null?"":stringBuilders[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(convert("AB",3));
    }
}
