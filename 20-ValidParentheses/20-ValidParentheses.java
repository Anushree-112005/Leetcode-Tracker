// Last updated: 7/9/2026, 9:17:06 AM
import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) return false;

                char c = st.pop();

                if (ch == ')' && c != '(') return false;
                if (ch == '}' && c != '{') return false;
                if (ch == ']' && c != '[') return false;
            }
        }

        return st.isEmpty();
    }
}