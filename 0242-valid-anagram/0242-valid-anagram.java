class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // THIS IS THE BRUTE LOGIC BY SORTING 
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a,b);
        


        // BELOW IS THE OPTIMAL APPROACH BY CHECKING FREQUENCY
        int [] freq = new int [26];
        for(int i = 0 ; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}