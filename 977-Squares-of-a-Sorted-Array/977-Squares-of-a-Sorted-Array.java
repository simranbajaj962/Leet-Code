// Approach 1
// Time Complexity: O(n log(n))
// Space Complexity: O(1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
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
        int[] result = new int[nums.length];

        int a=0;
        int i=0;
        int j=0;

        for(int k=0;k<nums.length;k++){
            if(nums[k] < 0) j++;
            nums[k]=nums[k]*nums[k];
        }
        i=j-1;

        while(i>=0 && j<nums.length){
            if(nums[i] < nums[j]){
                result[a]=nums[i];
                i--;
            }else{
                result[a]=nums[j];
                j++;
            }
            a++;
        }

        while(i>=0){
            result[a]=nums[i];
            i--;
            a++;
        }

        while(j<nums.length){
            result[a] = nums[j];
            j++;
            a++;
        }
        return result;
    }
}