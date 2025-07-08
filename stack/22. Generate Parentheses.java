class Solution {
    public void recursive_fun(int n,int leftCount,List<String> final_ans,int rightCount,String temp_string){
        if(temp_string.length() == 2*n){
            final_ans.add(temp_string);return;}
        if(leftCount > 0){
            recursive_fun(n,leftCount - 1 ,final_ans,rightCount,temp_string + "(");
        }
        if(rightCount > leftCount){
            recursive_fun(n,leftCount ,final_ans,rightCount-1,temp_string + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> final_ans = new ArrayList<>(); 
        recursive_fun(n,n,final_ans,n,"");
        return final_ans;
    }
}
