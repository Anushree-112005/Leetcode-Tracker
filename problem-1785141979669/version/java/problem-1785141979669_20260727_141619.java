// Last updated: 7/27/2026, 2:16:19 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        HashMap<String, List<String>> map = new HashMap<>();
6        for(String s : strs) {
7            char[] ch = s.toCharArray();
8            Arrays.sort(ch);
9            String key = new String(ch);
10            if(!map.containsKey(key)) {
11                map.put(key, new ArrayList<>());
12            }
13            map.get(key).add(s);
14        }
15        return new ArrayList<>(map.values());
16    }
17}