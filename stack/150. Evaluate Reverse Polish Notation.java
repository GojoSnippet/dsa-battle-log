class Solution {
    public int calc_val(int b,int a,String s){
        switch(s){
            case "+":
                return a+b;
            case "-":
                return a - b;
            case "/":
                return a/b;
            case "*":
                return a*b;
        };
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Set<String> myset = new HashSet<>();
        myset.add("+");myset.add("-");myset.add("*");myset.add("/");
        Stack<Integer> mystack = new Stack<>();
        for(int i=0;i<tokens.length;++i){
            if(myset.contains(tokens[i])){
                int a = mystack.pop();
                int b = mystack.pop();
                int result = calc_val(a,b,tokens[i]);
                mystack.push(result);
            }else{
                mystack.push(Integer.valueOf(tokens[i]));
            }
        }
        return mystack.peek();
    }
}
