// Last updated: 13/08/2026, 15:18:00
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        // Count frequencies and track maximum frequency
        for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }

        // Sum frequencies of elements having maximum frequency
        int result = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) {
                result += count;
            }
        }

        return result;
    }
}