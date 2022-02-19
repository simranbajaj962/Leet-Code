class Solution {
    public int search(int[] nums, int target) {
        return searchTarget(nums, target, 0, nums.length - 1);
    }

    int searchTarget(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return searchTarget(arr, target, start, mid - 1);
        } else {
            return searchTarget(arr, target, mid + 1, end);
        }
    }
}
