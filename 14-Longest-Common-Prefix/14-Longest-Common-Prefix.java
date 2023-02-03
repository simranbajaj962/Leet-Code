class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        // sort the given array of strings
        Arrays.sort(strs);

        // getting the first and last strings(words)
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        // start comparing the letters of first and last word
        for (int i = 0; i < first.length; i++) {
            // if anywhere letters do not match then there will be no more letters that can
            // be added to the common prefix.
            if (first[i] != last[i])
                break;
            res.append(first[i]);
        }
        return res.toString();
    }
}
