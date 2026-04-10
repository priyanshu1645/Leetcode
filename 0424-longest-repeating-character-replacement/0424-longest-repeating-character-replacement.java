class Solution {
    public int characterReplacement(String s, int k) {
        // optimal approach sliding window
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;





        // brute force logic
        // int n = s.length();
        // int maxlen = 0;
        // for(int i = 0 ; i < n ;i++){
        //     int [] freq = new int [26];
        //     int maxfreq = 0;
        //     for(int j = i; j < n;j++){
        //         freq[ s.charAt(j) - 'A']++;
        //         maxfreq = Math.max(maxfreq,freq[ s.charAt(j) - 'A']);
        //         int length = j - i + 1;
        //         int changes = length - maxfreq;
        //         if(changes <= k){
        //             maxlen = Math.max(maxlen, length);
        //         }
        //     }
        // }
        // return maxlen;
    }
}