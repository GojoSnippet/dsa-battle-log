class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())return false;
        HashMap<Character,Integer> word1_map=new HashMap<>();
        for(Character s: word1.toCharArray())word1_map.put(s,word1_map.getOrDefault(s,0)+1);
        HashMap<Character,Integer> word2_map=new HashMap<>();
        for(Character s: word2.toCharArray())word2_map.put(s,word2_map.getOrDefault(s,0)+1);
        Set<Integer> temp1=new HashSet<>(word1_map.values());
        Set<Integer> temp2=new HashSet<>(word2_map.values());
        return temp1.equals(temp2) ? true : false;
    }
}
