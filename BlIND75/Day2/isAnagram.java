import java.util.HashMap;

class isAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> hi=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (hi.containsKey(ch)) {
                hi.put(ch, hi.get(ch) + 1); 
            } else {
                hi.put(ch, 1);
}

            }
        for (int j = 0; j < t.length(); j++) {
            char th = t.charAt(j);

            if (!hi.containsKey(th)) {
                return false;
            }

            hi.put(th, hi.get(th) - 1);

            if (hi.get(th) < 0) {
                return false;
            }
        }

        return true;
    
    }
} 
