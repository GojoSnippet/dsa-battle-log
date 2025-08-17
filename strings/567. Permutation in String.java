class Solution {
    public boolean isEqual(int[] a,int[] b){
        for(int i=0;i<a.length;++i)
        if(a[i] != b[i])return false;
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())return false;
        int window_size = s1.length();
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for(Character c : s1.toCharArray())s1Array[c - 'a']++;
        for(int i=0;i<window_size;++i){
            s2Array[s2.charAt(i)-'a']++;
        }
        int start = 0;int end = window_size -1;
        while(end < s2.length()){
            if(isEqual(s1Array,s2Array))return true;
            s2Array[s2.charAt(start) - 'a'] --;
            start++;
            end++;
            if(end< s2.length()) s2Array[s2.charAt(end) - 'a']++;
        }
        return false;
    }
}
