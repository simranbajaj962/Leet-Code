class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // making a map of value with true
        // (assigning true to all the elements)
        for (int val : nums) {
            map.put(val, true);
        }

        // assigning false if the smaller value is present
        // in the map which means the value we are checking is
        // not the starting of any sequence
        for (int val : nums) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }

        // finally calculating the length
        int maxStartPoint = 0;
        int maxLength = 0;
        for (int val : nums) {
            if (map.get(val) == true) {
                int tempLength = 1;
                int tempStartPoint = val;

                while (map.containsKey(tempStartPoint + tempLength)) {
                    tempLength++;
                }

                if (tempLength > maxLength) {
                    maxLength = tempLength;
                    maxStartPoint = tempStartPoint;
                }
            }
        }
        return maxLength;
    }
}