class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] res_array = new double[position.length][2];
        for(int i=0;i<position.length;++i){
            res_array[i][0] = (double)position[i];
            res_array[i][1] = speed[i];
        }
        Arrays.sort(res_array,(a,b) -> Double.compare(a[0],b[0]));
        Stack<Double> mystack = new Stack<>();
        for(int i=position.length-1;i>=0;--i){
            double time = (target - res_array[i][0]) / res_array[i][1];
            if(!mystack.isEmpty() && time <= mystack.peek())continue;
            mystack.push(time);
        }
        return mystack.size();
    } 
}
