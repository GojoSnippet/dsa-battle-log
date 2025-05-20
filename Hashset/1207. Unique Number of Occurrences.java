class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mymap= new HashMap<>();
        for(int i: arr)mymap.put(i,mymap.getOrDefault(i,0)+1);
        Set<Integer> myset= new HashSet<>(mymap.values());
        if(mymap.size() != myset.size())return false;
        return true;
    }
}
