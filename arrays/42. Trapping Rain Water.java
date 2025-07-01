class Solution {
    public int trap(int[] height) {
        if(height.length < 2)return 0;
        int p1=0,p2=height.length-1;
        int left_max = height[0],right_max=height[height.length-1];
        int curr_max=0;
        while(p1 < p2){
            left_max = Math.max(height[p1],left_max);
             right_max = Math.max(height[p2],right_max);
             if(left_max < right_max){
                curr_max+= left_max - height[p1];
                p1++;
             }
             else{
                curr_max += right_max - height[p2];
                p2--;
             }
             
        }
        return curr_max;
    }
}
