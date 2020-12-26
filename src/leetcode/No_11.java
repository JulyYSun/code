package leetcode;
/*
    Created by YS
    2020/11/2 18:45
*/

public class No_11 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,result=0;
        while (i<j){
            result=height[i]<height[j]?
                    Math.max((j-i)*height[i++],result) :
                    Math.max((j-i)*height[j--],result);
        }
        return result;
    }
}
