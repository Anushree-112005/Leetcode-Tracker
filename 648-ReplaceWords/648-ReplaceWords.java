// Last updated: 7/9/2026, 9:14:40 AM
import java.util.*;
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String shortest = words[i];
            for (String root : dictionary) {
                if (words[i].startsWith(root)) {
                    if (root.length() < shortest.length()) {
                        shortest = root;
                    }
                }
            }
            words[i] = shortest;
        }
        return String.join(" ", words);
    }
}