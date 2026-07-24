// Group Anagrams (LeetCode #49) — Arrays & Hashing (group by a canonical signature)
// Idea: anagrams share a SIGNATURE. Build one signature per word, bucket words by it.
// Time O(n·k), Space O(n·k)   (n = #strings, k = word length).
//
// [2026-07-24] Re-solve — cleaner than the earlier version: dropped the redundant
// final_ans.put(...) in the "found" branch (the list is mutated in place, so re-putting is
// pointless), and used the List interface type. Signature used = a Map<Character,Integer> as the key.
//
// UPGRADE for interviews: a Map-as-key works (Java uses Map.equals/hashCode) but carries overhead
// (autoboxing chars/ints + hashing a whole map) and is unconventional. Reach instead for a
// sorted-string key (simplest to explain) or an int[26] count key (fastest, O(k)). Both below.
// Also: computeIfAbsent collapses the if/else into one line.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>,List<String>> strMap = new HashMap<>();
        for(String s: strs){
            Map<Character,Integer> charMap = new HashMap<>();
            for(int i=0;i<s.length();++i){
                charMap.put(s.charAt(i),charMap.getOrDefault(s.charAt(i),0)+1);
            }
            if(strMap.containsKey(charMap)){
                strMap.get(charMap).add(s);
            } else {
                strMap.put(charMap,new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(strMap.values());
    }
}

/* Canonical variant A — sorted-string key (clearest to explain in an interview):
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);                     // O(k log k) per word
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}

// Variant B — int[26] count key (fastest, O(k), no sort):
//   int[] cnt = new int[26];
//   for (char ch : s.toCharArray()) cnt[ch - 'a']++;
//   StringBuilder sb = new StringBuilder();
//   for (int i = 0; i < 26; i++) sb.append('#').append(cnt[i]);   // e.g. "#1#0#0#2..."
//   String key = sb.toString();
//   groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
*/
