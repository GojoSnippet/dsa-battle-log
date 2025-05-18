class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>,ArrayList<String>> final_ans= new HashMap<>();
        for(String s: strs){
            Map<Character,Integer> temp_map=new HashMap<>();
            for(Character c: s.toCharArray()){
                temp_map.put(c,temp_map.getOrDefault(c,0)+1);
            }
            if(final_ans.containsKey(temp_map)){
                ArrayList<String> temp_list = final_ans.get(temp_map);
                temp_list.add(s);
                final_ans.put(temp_map,temp_list);
            }
            else{
                ArrayList<String> temp_list = new ArrayList<>();
                temp_list.add(s);
                final_ans.put(temp_map,temp_list);
            }
        }
        return new ArrayList<>(final_ans.values());
    }
}
