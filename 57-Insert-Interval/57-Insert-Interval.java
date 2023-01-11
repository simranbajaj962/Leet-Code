class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] arr : intervals) {
            // check if the newInterval falls after the given interval
            if (arr[1] < newInterval[0]) {
                result.add(arr);
                // check if the newInterval falls before the given interval
            } else if (arr[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = arr;
                // check if the newInterval overlapps the given interval in any way
            } else {
                newInterval[0] = Math.min(arr[0], newInterval[0]);
                newInterval[1] = Math.max(arr[1], newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}