class Solution {
    public int[] checkMountain(int[] arr,int index){
        int[] final_ans = new int[2];
        int startIndex = index;
        int count =1;
        int increaseFlag = 0,decreaseFlag = 0;
        while(index + 1 < arr.length && arr[index +1] > arr[index]){
            index++;
            count++;
            increaseFlag =1;
        }
        while(index + 1 < arr.length && arr[index +1] < arr[index]){
            index++;
            count++;
            decreaseFlag=1;
        }
        if(increaseFlag == 1 && decreaseFlag ==1)return new int[]{count,index};
        else return new int[]{0,index};
    }
    public int longestMountain(int[] arr) {
        if(arr.length == 1)return 0;
        int startIndex=0,iterator=0;
        int maxLength = 0;int posFlag=0;
        while(iterator+1 < arr.length){
            int count = 0;
            if(arr[iterator+ 1] <= arr[iterator]){
                iterator++;
            }
            else if(arr[iterator+1] > arr[iterator]){
                int[] new_arr = checkMountain(arr,iterator);
                maxLength = Math.max(new_arr[0],maxLength);
                iterator = new_arr[1] ;
            }
            
        }
        return maxLength;
    }
}
