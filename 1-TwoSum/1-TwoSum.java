// Last updated: 02/09/2026, 10:08:56
1import java.util.HashMap;
2
3class Solution {
4
5    public int[] twoSum(int[] nums, int target) {
6
7        // Create HashMap to store number and its index
8        HashMap<Integer, Integer> map = new HashMap<>();
9
10        // Traverse through the array
11        for (int i = 0; i < nums.length; i++) {
12
13            // Calculate the number needed to reach target
14            int needed = target - nums[i];
15
16            // Check whether the needed number already exists
17            if (map.containsKey(needed)) {
18
19                // Return the index of needed number and current index
20                return new int[]{map.get(needed), i};
21            }
22
23            // Store current number and its index
24            map.put(nums[i], i);
25        }
26
27        // Return empty array if no pair is found
28        return new int[]{};
29    }
30}