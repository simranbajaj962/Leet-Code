// Approach 1
// Time Complexity: O(n log(n))
// Space Complexity: O(1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

// Approach 2 (Two pointer approach)
// Time Complexity: O(N)
// Space Complexity: O(N)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];

        int start = 0, end = nums.length - 1;
        int resIdx = nums.length - 1;

        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                res[resIdx--] = nums[start] * nums[start];
                start++;
            } else {
                res[resIdx--] = nums[end] * nums[end];
                end--;
            }
        }
        return res;
    }
}
