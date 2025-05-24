class Solution {
    public int countPoints(String rings) {
        Map<Integer,HashSet<Character>> mymap = new HashMap<>();
        for (int i = 0; i < rings.length() - 1; i += 2) {
            int rod = rings.charAt(i + 1) - '0';
            char color = rings.charAt(i);

            mymap.putIfAbsent(rod, new HashSet<>());
            mymap.get(rod).add(color);
        }
    int count=0;
    for (HashSet<Character> value : mymap.values()) {
            if (value.size() == 3) {
                count++;
            }
        }
    return count;}
}
