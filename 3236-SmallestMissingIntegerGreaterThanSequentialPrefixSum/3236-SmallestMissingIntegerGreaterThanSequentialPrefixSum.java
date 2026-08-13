// Last updated: 13/08/2026, 15:18:02
import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in set
        for (int num : nums) {
            set.add(num);
        }

        // Find longest sequential prefix sum
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Find smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}