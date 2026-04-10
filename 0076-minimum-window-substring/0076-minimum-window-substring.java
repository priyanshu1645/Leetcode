class Solution {
    public String minWindow(String s, String t) {
        // optimal logic direct 
        if(s.length() == 0 || t.length() == 0) return "";
        int [] freq = new int [128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int count = t.length();
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int left = 0;
        for(int right= 0; right < s.length(); right++){
            if (freq[s.charAt(right)] > 0){
                count --;
            }
            freq[s.charAt(right)]--;
            while(count == 0){
                if(right - left + 1 < minlen){
                    minlen = right - left + 1;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] > 0){
                    count ++;
                }
                left ++;
            }
        }
        if(minlen == Integer.MAX_VALUE)return "";
        return s.substring(start, start + minlen);
    }
}