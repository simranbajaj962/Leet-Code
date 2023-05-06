//---------Brute force--------------
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, water);
            }
        }
        return max;
    }
}

// ---------Two-pointer approach---------------
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            maxWater = Math.max(area, maxWater);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
