class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // this is the optimal approach 
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        // 1st pass: find candidates
        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // 2nd pass: verify
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > nums.length / 3) result.add(candidate1);
        if (count2 > nums.length / 3) result.add(candidate2);

        return result;
        // this is the brute approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> result = new ArrayList<>();

        //  count frequency
        // for (int num : nums) {
            // map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        //  check condition
        // for (int key : map.keySet()) {
            // if (map.get(key) > nums.length / 3) {
                // result.add(key);
            // }
        // }

        // return result;
    }
}