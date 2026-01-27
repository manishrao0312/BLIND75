package BlIND75.Day5;

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int expected=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        expected=(n*(n+1))/2;
        int difference=expected-sum;
        return difference;
    }
}