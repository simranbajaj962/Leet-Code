class Solution {
    public int missingNumber(int[] nums) {
        int sumOfArray = 0;
        // Doing sum of all the numbers present in the given array
        for(int num:nums){
            sumOfArray+=num;
        }
        
        // finding the total sum of all the numbers from 0 to the length of the given array
        int n=nums.length;
        int sumAll = n*(n+1)/2;
        
        // returning the missing number
        return sumAll-sumOfArray;
    }
}
