//------positioning nonzeros at front and fill rest array with 0-------------
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        // extracting all non zeros and putting them accordingly from first position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero++] = nums[i];
            }
        }

        // after filling all the nonzero elements
        // inserting 0's to the rest part of the array
        for (int i = nonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

// ----------swapping--------------------
class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, ptr);
                ptr++;
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
