// Last updated: 7/29/2026, 2:56:26 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if (capitalCount == word.length())
            return true;
        if (capitalCount == 0)
            return true;
        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0)))
            return true;
        return false;
    }
}