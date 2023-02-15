class Solution {
    public int pivotIndex(int[] nums) {

        // calculating sum of all the elements present in array
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        // initialising left and right sum
        int leftSum = 0;
        int rightSum = totalSum;

        // checking if at any point left and right sum matches
        // return that index
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}