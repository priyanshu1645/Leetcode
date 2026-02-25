class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posindex = 0;
        int negindex = 1;
        for(int num : nums){
            if(num > 0){
                result[posindex] = num;
                posindex += 2;
            }else{
                result[negindex] = num;
                negindex += 2;
            }
            
        }
        return result;
    }
}