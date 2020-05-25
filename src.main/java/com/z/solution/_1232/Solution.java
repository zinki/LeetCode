package com.z.solution._1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){
            return true;
        }

        for(int index=1;index <coordinates.length-1;index++){
            int x1 = coordinates[index-1][0],y1=coordinates[index-1][1];
            int x2 = coordinates[index][0],y2=coordinates[index][1];
            int x3 = coordinates[index+1][0],y3=coordinates[index+1][1];
            if((x3-x2)*(y2-y1) != (x2-x1)*(y3-y2)){
                return false;
            }
        }
        return true;
    }
}

