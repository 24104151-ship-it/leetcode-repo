// Last updated: 13/08/2026, 15:18:05
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        int answersum[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                rightsum[i] += nums[j];} }
        for(int i = nums.length -1 ; i >= 0 ; i--){
            for(int j = i -1 ; j >=0 ; j--){
                leftsum[i] += nums[j]; } }
    for(int k = 0 ; k < nums.length ; k++){
        answersum[k] = Math.abs(leftsum[k] - rightsum[k]); }
    return answersum;


        
    }
}