class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int j = 0;
        for(i = 0 ; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            for(j = 0; j < nums.length; j++){
                if(nums[j] == num){
                    count ++;
                }
                
                }
                if(count == 1){
                    return num;
            }
        }
        return -1;

    }
}