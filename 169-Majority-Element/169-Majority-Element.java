//-----Boyer-Moore voting algorithm-----------
class Solution {
    public int majorityElement(int[] nums) {
        int elem = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                elem = num;
            if (num == elem) {
                count++;
            } else {
                count--;
            }
        }
        return elem;
    }
}