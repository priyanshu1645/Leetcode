class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (char c : s.toCharArray()){
        if(c == '('){
            low ++;
            high ++;
        }else if(c == ')'){
            low --;
            high --;
        }else{ // *
            low --;
            high ++;
        }
        if(high < 0)return false;
        if(low < 0)low = 0;
    }
    return low == 0;
    }
}
//  brute logic backtracking
//class Solution {
//     public boolean checkValidString(String s) {
//         return solve(s, 0, 0);
//     }

//     private boolean solve(String s, int i, int balance) {
//         if (balance < 0) return false;

//         if (i == s.length()) return balance == 0;

//         char c = s.charAt(i);

//         if (c == '(') 
//             return solve(s, i + 1, balance + 1);

//         if (c == ')') 
//             return solve(s, i + 1, balance - 1);

//         // '*'
//         return solve(s, i + 1, balance + 1) ||   // treat as '('
//                solve(s, i + 1, balance - 1) ||   // treat as ')'
//                solve(s, i + 1, balance);         // treat as ""
//     }
// }