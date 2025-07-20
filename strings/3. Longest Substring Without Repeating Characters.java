class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)return 0;
        int maxCount=0;
        int startIndex= 0;int endIndex = 0;
        int count =1;Map<Character,Integer> mymap =  new HashMap<>();int x=0;
            while(endIndex < s.length()){
                if(mymap.containsKey(s.charAt(endIndex)) && (mymap.get(s.charAt(endIndex)) >= startIndex)){
                    int i = mymap.get(s.charAt(endIndex));
                    startIndex= i+1;
                }
                mymap.put(s.charAt(endIndex),endIndex);
                count = endIndex - startIndex+1;
                endIndex++;
                maxCount= Math.max(maxCount,count);
            }
        return maxCount;
    }
}
