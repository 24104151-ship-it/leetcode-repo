// Last updated: 13/08/2026, 15:17:26
class Solution {
    public int maxDigitRange(int[] nums) {
        int max=-1;
        int sum=0;
        for(int num:nums){
            int range=digitRange(num);
            if(range>max){
                max=range;
            }
            
        }
        for(int num:nums){
            if(digitRange(num)==max){
                sum+=num;
            }
        } 
        return sum;
    }
    private int digitRange(int num){
        num=Math.abs(num);
        if(num==0){
            return 0;
        }
        int minDigit=9;
        int maxDigit=0;
        while(num>0){
            int digit=num%10;
            minDigit=Math.min(minDigit,digit);
            maxDigit=Math.max(maxDigit,digit);
            num/=10;
        }
        return maxDigit-minDigit;
    }
}