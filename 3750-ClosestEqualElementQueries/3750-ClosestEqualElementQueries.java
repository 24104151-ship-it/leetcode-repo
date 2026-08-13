// Last updated: 13/08/2026, 15:17:45
import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);}
        List<Integer> ans = new ArrayList<>();
        for (int q : queries) {
            List<Integer> pos = map.get(nums[q]);
            if (pos.size() == 1) {
                ans.add(-1);
                continue;}
            int idx = Collections.binarySearch(pos, q);
            int m = pos.size();
            int prev = pos.get((idx - 1 + m) % m);
            int next = pos.get((idx + 1) % m);
            int d1 = Math.abs(q - prev);
            d1 = Math.min(d1, n - d1);
            int d2 = Math.abs(q - next);
            d2 = Math.min(d2, n - d2);
            ans.add(Math.min(d1, d2));}
   return ans;
    }
}