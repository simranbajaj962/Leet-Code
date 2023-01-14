// This file contains two different codes (Approach is same)

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

// another code for the same:-
class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<String>();
        vp(n,0,0,"",list);
        return list;
        
    }
    
    public static void vp(int n , int open , int close, String ans, List<String> list){
        if (open == n && close == n){
           list.add(ans);
            return;
        }
        if (open > n || close > open){
            return;
        }
        
        vp(n, open+1, close, ans + "(" , list);
        vp(n, open, close+1, ans + ")", list);

        
    }
}
