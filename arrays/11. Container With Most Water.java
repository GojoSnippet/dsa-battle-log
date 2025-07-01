class Solution {
    public int calcArea(int index1,int index2,int h1,int h2){
        int a= Math.abs(index1-index2);
        return a * Math.min(h1,h2);
    }
    public int maxArea(int[] height) {
        int p1=0,p2=height.length-1;
        int curr_max=calcArea(0,height.length-1,height[0],height[height.length-1]);
        while(p1 < p2){
            if(calcArea(p1+1,p2,height[p1 +1],height[p2]) > curr_max){
                curr_max = calcArea(p1+1,p2,height[p1 +1],height[p2]);
                p1++;
            }
            else{
                if(calcArea(p1,p2-1,height[p1 ],height[p2-1]) > curr_max) {
                    curr_max=calcArea(p1,p2-1,height[p1],height[p2-1]);
                    p2--;
                    }
                else {
                    if(height[p1] >= height[p2])p2--;
                    else p1++;
                }
            }
        }
        return curr_max;
    }
}
