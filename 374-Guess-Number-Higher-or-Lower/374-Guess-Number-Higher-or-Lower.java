public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                // num == pick
                return mid;
            } else if (guess(mid) == -1) {
                // num > pick
                end = mid - 1;
            } else if (guess(mid) == 1) {
                // num < pick
                start = mid + 1;
            }
        }
        return -1;

    }
}