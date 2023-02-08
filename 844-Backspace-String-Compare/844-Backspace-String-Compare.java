class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }

    private String getString(String input) {
        StringBuilder res = new StringBuilder();
        int hashCount = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            // keeping count of backspaces
            if (input.charAt(i) == '#') {
                hashCount++;
                continue;
            }

            // if backspace count>0 decrement it
            // and skip the character
            if (hashCount > 0) {
                hashCount--;
            } else {
                // if backspace count=0 insert the character
                // at beginning of the resultant string
                res.insert(0, input.charAt(i));
            }
        }
        // return the actual string without backspaces
        return res.toString();
    }
}