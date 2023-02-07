class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        char[] arr = new char[128];
        // taking out frequencies of each character
        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }
        // checking if count is even then it can be separated
        // into two eqaul halves and
        // if count is odd then make it even by doing(-1)
        // and then add to the result
        for (int count : arr) {
            if (count % 2 == 0)
                result += count;
            else if (count % 2 >= 1)
                result += count - 1;
        }
        // check if the result is less than the length
        // of the given string then one more character
        // can be added in the middle of the word
        return result + (s.length() > result ? 1 : 0);
    }
}