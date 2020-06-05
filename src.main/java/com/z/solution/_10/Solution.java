package com.z.solution._10;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isMatch(String s, String p) {
        int i = 0,j = 0;
        List<String> stringList = groupRegex(p);
        while (i < s.length() && j < stringList.size()) {
            String regex = stringList.get(j);
            if (regex.length() == 1) {
                if (regex.charAt(0) != '.') {
                    if (regex.charAt(0) != s.charAt(i)) {
                        return false;
                    }
                }
                i++;
            } else {
                if (regex.charAt(0) == '.') {
                    i = s.length();
                }else {
                    while (i < s.length()) {
                        if (s.charAt(i) != regex.charAt(0)) {
                            break;
                        }
                        i++;
                    }
                }
            }
            j++;
        }
        if(i < s.length() || j<stringList.size()){
            return false;
        }
        return true;
    }

    public static List<String> groupRegex(String s){
        int index = 0;
        List<String> list = new ArrayList<>();
        while (index<s.length()){
            if(index < s.length()-1 && '*' == s.charAt(index+1)){
                list.add(s.charAt(index) + "" + s.charAt(index+1));
                index++;
            }else {
                list.add(s.charAt(index) + "");
            }
            index ++;
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(isMatch("aaa","a*a*a*"));
    }
}
