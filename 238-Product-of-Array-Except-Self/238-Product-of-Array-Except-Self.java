class Solution {
    public int[] productExceptSelf(int[] nums) {
        // creating two arrays left and right
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        // filling the left array
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // filling the right array
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // resultant array is simply the product of left and right array
        // which is product of elements which are in its left and right side
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}