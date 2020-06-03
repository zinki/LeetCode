package com.z.solution._893;

import java.util.*;

public class Solution {
    public static int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for(String str:A){
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int index = 0;index<chars.length;index++){
                if(index%2==0){
                    even.append(chars[index]);
                }else {
                    odd.append(chars[index]);
                }
            }
            char[] evenChars = even.toString().toCharArray();
            char[] oddChars = odd.toString().toCharArray();
            Arrays.sort(evenChars);
            Arrays.sort(oddChars);
            set.add(new String(oddChars) + new String(evenChars));
        }
        return set.size();
    }

    public static void main(String[] args){
        System.out.println(numSpecialEquivGroups(new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"}));
    }
}
