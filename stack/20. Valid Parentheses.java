Next time please try to use HashMap and commit the code
class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack =  new Stack<>();
        for(char i: s.toCharArray()){
            if(i == '(' || i == '{' || i=='['){
                mystack.push(i);
            }
            else{
                if(mystack.empty())return false;
                char top_elem = mystack.peek();
                if((top_elem == '(' && i==')') || (top_elem == '{' && i=='}') || (top_elem == '[' && i==']')){
                    mystack.pop();}
            else{
                return false;
            }
        }
    }
     if(mystack.empty())return true;
    else return false;
}}
