UUse int array next time

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> mymap = new HashMap<>();
        for(Character s: s1.toCharArray())mymap.put(s,mymap.getOrDefault(s,0)+1);
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 > l2)return false;
        int startIndex=0;int lastIndex = l1-1;
        Map<Character,Integer> newmap = new HashMap<>();
        for(int i=0;i<l1;++i)newmap.put(s2.charAt(i),newmap.getOrDefault(s2.charAt(i),0)+1);
        if(mymap.equals(newmap))return true;
        while(lastIndex+1 <= l2-1){
            Character c =s2.charAt(startIndex);
            if(newmap.get(c)== 1)newmap.remove(c);
            else newmap.put(c,newmap.get(c)-1);
            newmap.put(s2.charAt(lastIndex+1),newmap.getOrDefault(s2.charAt(lastIndex+1),0)+1);
            if(newmap.equals(mymap))return true;
            startIndex++;lastIndex++;
        }
        return false;
    }
}
