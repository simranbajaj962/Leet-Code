class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int water = 0;

        while (start <= end) {
            // width of the contained water
            int w = end - start;
            // height of the contained water
            int h = Math.min(height[start], height[end]);

            // area of the conatiner with water
            water = Math.max(water, w * h);

            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return water;
    }
}
