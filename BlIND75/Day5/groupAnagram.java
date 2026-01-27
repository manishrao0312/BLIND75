package BlIND75.Day5;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String signature = new String(chars);

            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }

            map.get(signature).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
