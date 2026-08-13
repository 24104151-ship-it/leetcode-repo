// Last updated: 13/08/2026, 15:17:24
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long total=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            long current=nums[n-1-i];
            total+=Math.max(current,current * mul);
            mul--;
        }
        return total;

        
    }
}