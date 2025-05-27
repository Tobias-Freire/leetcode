class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        String substr = "";
        for (int i = 0; i < s.length(); i++) {
            if (substr.indexOf(s.charAt(i)) == -1) {
                substr += s.charAt(i);
            } else {
                substr = substr.substring(substr.indexOf(s.charAt(i))+1);
                substr += s.charAt(i);
            }
            if (substr.length() > maxlength) {
                maxlength = substr.length();
            }
        }
        return maxlength;
    }
}