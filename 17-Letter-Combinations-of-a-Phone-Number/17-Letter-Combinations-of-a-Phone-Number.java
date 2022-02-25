class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<String>();
        if (digits.length() > 0)
            play(digits, "", list);
        return list;
    }

    public static void play(String ques, String ans, List<String> list) {

        if (ques.length() == 0) {
            list.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String nq = ques.substring(1);

        String code = getCode(ch);

        for (int i = 0; i < code.length(); i++) {
            play(nq, ans + code.charAt(i), list);
        }
    }

    public static String getCode(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else if (ch == '9') {
            return "wxyz";
        } else {
            return "";
        }
    }

}