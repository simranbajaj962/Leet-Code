class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 1) {
            return n == 1;
        }
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
