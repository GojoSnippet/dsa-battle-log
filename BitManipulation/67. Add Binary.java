class Solution {
    public String addBinary(String a, String b) {
        int x=a.length()-1,y=b.length()-1;
        String final_ans = "";
        int curr_sum=0,total_sum = 0;
        while(x >= 0 && y >=0){
            total_sum = (int)a.charAt(x) +(int)b.charAt(y)+curr_sum - '0' - '0';
            System.out.println(total_sum);
            if(total_sum == 0){
                final_ans = "0"  + final_ans;curr_sum=0;
            }
            else if(total_sum == 1){final_ans = "1"  + final_ans;curr_sum=0;}
            else {
                if(total_sum == 2){
                final_ans = "0" + final_ans;
                curr_sum = 1;
                }
                else{
                final_ans = "1" + final_ans;
                curr_sum = 1;
                }
            }
            total_sum = 0;
            x--;y--;
        }
        while(x >= 0){
            total_sum = (int)a.charAt(x) +curr_sum - '0';
            System.out.println(total_sum);
            if(total_sum == 0){
                final_ans = "0"  + final_ans;
                curr_sum=0;
            }
            else if(total_sum == 1){final_ans = "1"  + final_ans;curr_sum=0;}
            else {
                if(total_sum == 2){
                final_ans = "0" + final_ans;
                curr_sum = 1;
                }
                else{
                final_ans = "1" + final_ans;
                curr_sum = 1;
                }
            }
            total_sum = 0;
            x--;

        }
        while(y >= 0){
            total_sum = (int)b.charAt(y)+curr_sum  - '0';
            System.out.println(total_sum);
            if(total_sum == 0){
                final_ans = "0"  + final_ans;
                curr_sum=0;
            }
            else if(total_sum == 1){final_ans = "1"  + final_ans;curr_sum=0;}
            else {
                if(total_sum == 2){
                final_ans = "0" + final_ans;
                curr_sum = 1;
                }
                else{
                final_ans = "1" + final_ans;
                curr_sum = 1;
                }
            }
            total_sum = 0;
            y--;
        }
        if(curr_sum == 1)final_ans = "1" + final_ans;
        return final_ans;
    }
}
