class Solution {
    public int lengthOfLongestSubstring(String s) {
        // this is the 2 pointer brute approach
        // int n = s.length();
        // int maxlen = 0;
        // for(int i = 0; i < n ; i++){
        //    HashSet<Character> set = new HashSet<>();
        //     for(int j = i; j < n; j++){
        //         if(set.contains(s.charAt(j))){
        //             break;

        //         }
        //             set.add(s.charAt(j));
        //             maxlen = Math.max(maxlen, j - i + 1);
        //     }
        // }
        // return maxlen;

        // here is optimal sliding windowapproach
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right ++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
            left = Math.max(left, map.get(ch) + 1);
        }
        map.put(ch, right);
        maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}