class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] freqP = new int[26];
        int[] window = new int[26];

        for(char c : p.toCharArray()){
            freqP[c - 'a']++;
        }
        int k = p.length();
        for(int i = 0; i < s.length(); i++){
            window[s.charAt(i) - 'a']++;
            if(i >= k){
                window[s.charAt(i-k) - 'a']--;
            }
            if(Arrays.equals(freqP,window)){
                result.add(i - k + 1);
            }
        }
        return result;
    }
}