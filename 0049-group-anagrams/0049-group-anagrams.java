class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

//          BELLOW IS THE BRUTE APPROACH 
//         List<List<String>> result = new ArrayList<>();
//         boolean [] visited = new boolean[strs.length];
//         for(int i = 0; i < strs.length; i++){
//             if(visited[i]) continue;

//             List<String> group = new ArrayList<>();
//             group.add(strs[i]);
//             visited[i] = true;

//             for(int j = 0; j < strs.length; j++){
//                 if(!visited[j] && isAnagram(strs[i], strs[j])){
//                     group.add(strs[j]);
//                     visited[j] = true;
//                 }
                
//             }
//             result.add(group);
//         }
//         return result;
//     }
//     public boolean isAnagram(String a ,String b){
//             char[] x = a.toCharArray();
//             char[] y = b.toCharArray();
//             Arrays.sort(x);
//             Arrays.sort(y);
//             return Arrays.equals(x,y);
        
//     }
// }