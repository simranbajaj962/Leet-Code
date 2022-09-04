class Solution {
    public int missingNumber(int[] nums) {
        int xorOfAll = nums.length;
        // WHAT XOR basically does is:
        // XOR OF SAME NUMBER GIVES 0 (3^3 = 0)
        // XOR OF ANY NUMBER WITH ZERO GIVES THAT NUMBER (3^0 = 3)
        for(int i=0;i<nums.length;i++){
            xorOfAll^=i^nums[i];
        }
        return xorOfAll;
    }
}
