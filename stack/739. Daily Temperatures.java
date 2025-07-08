class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> mystack= new Stack<>();
        int[] final_ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;++i){
            while(!mystack.isEmpty() && temperatures[i] > temperatures[mystack.peek()]){
                final_ans[mystack.peek()] = i - mystack.peek() ; 
                mystack.pop();
            }
            mystack.push(i);
        } 
        return final_ans;
    }
}
