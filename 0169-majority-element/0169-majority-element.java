class Solution {
    public int majorityElement(int[] nums) {
        // below is the optimal solution ussing moore's voting algo
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
            
        }
        return candidate;
    
        // below is the brute method with hashmap approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        //     if(map.get(num) > nums.length / 2){
        //         return num;
        //     }
            
        // }
        // return  -1;
    }
}