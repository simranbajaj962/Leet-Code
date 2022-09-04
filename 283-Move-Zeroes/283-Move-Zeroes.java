class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        //extracting all non zeros and putting them accordingly from first position
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZero++] = nums[i];
            }
        }
        
        // after filling all the nonzero elements
        // inserting 0's to the rest part of the array
        for(int i= nonZero;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
