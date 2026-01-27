package BlIND75.Day5;
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left = 0;

        for(int i=0;i<s.length();i++){
             char g=s.charAt(i);
             while(map.containsKey(g)){
                    map.remove(s.charAt(left));
                    left=left+1;
             }
             map.put(g,1);
             count = Math.max(count, map.size());

            
    }
    return count;
}
}