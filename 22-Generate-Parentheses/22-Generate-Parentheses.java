class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, 0, n, res, "");
        return res;
    }

    private void backtrack(int openCount, int closeCount, int n, List<String> res, String s) {
        if (openCount == n && closeCount == n) {
            res.add(s);
            return;
        }

        if (openCount < n) {
            backtrack(openCount + 1, closeCount, n, res, s + "(");
        }

        if (closeCount < openCount) {
            backtrack(openCount, closeCount + 1, n, res, s + ")");
        }
    }
}
