// Last updated: 13/08/2026, 15:17:40
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = nums[0];
        long t = (long)k;
        long min = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i]; }
                if(nums[i] < min){
                    min = nums[i];}}
    return (max - min)*t ;
    }
}