class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int frst_max = Integer.MIN_VALUE;
        int scnd_max = Integer.MIN_VALUE;
        int frst_count=0;int scnd_count=0;
        for(int i:nums){
            if(i== frst_max)frst_count++;
            else if(i==scnd_max)scnd_count++;
            else if(frst_count==0){frst_max=i;frst_count++;}
            else if(scnd_count==0){scnd_max=i;scnd_count++;}
            else{
                frst_count--;
                scnd_count--;
            }
        }
        int count1=0;int count2=0;
        for(int i:nums){
            if(i==frst_max){count1++;}
            if(i==scnd_max)count2++;
        }
        List<Integer> final_ans= new ArrayList<>();
        if(count1 >nums.length/3)final_ans.add(frst_max);
        if(count2>nums.length/3)final_ans.add(scnd_max);
        return final_ans;
    }
}
