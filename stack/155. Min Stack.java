class MinStack {
    private Stack<Long> minStackNum;
    private long minVal;
    public MinStack() {
        minStackNum = new Stack<>();
    }
    
    public void push(long val) {
        if(minStackNum.empty()){minStackNum.push(val);minVal  = val;return;}
        if(val <= minVal) {
            minStackNum.push((val - minVal) + val);
            minVal = val;
        }
        else minStackNum.push(val);
    }
    
    public void pop() {
        if(minStackNum.peek() <= minVal){
            minVal = 2 * minVal - minStackNum.peek();
            minStackNum.pop();
        } else minStackNum.pop();
    }
    
    public long top() {
        if(minStackNum.peek() <= minVal){
            return minVal;
        }
        return minStackNum.peek();
    }
    
    public long getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
