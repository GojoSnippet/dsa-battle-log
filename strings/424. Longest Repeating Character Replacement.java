class Solution {
    public int maxElement(int[] arr){
        int max = 0;
        for(int i : arr)max=Math.max(i,max);
        return max;
    }
    public int characterReplacement(String s, int k) {
        int[] charArray =new int[26];
        int startIndex = 0;int lastIndex=-1;int maxCount = 0;
        while(lastIndex < s.length()){
            if(lastIndex - startIndex - maxElement(charArray) < k){
                maxCount =  Math.max(lastIndex-startIndex+1,maxCount);
                lastIndex++;
                if(lastIndex < s.length())charArray[s.charAt(lastIndex) - 'A']++;
            }
            else{ 
                charArray[s.charAt(startIndex) - 'A']--;
                startIndex++;}
        }
        return maxCount;
    }
}
