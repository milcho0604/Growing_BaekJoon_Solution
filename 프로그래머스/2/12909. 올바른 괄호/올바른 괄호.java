import java.util.*;

public class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    answer = false;
                    break;
                }
            }
        }

        if (!st.isEmpty()) {
            answer = false;
        }

        return answer;
    }

}
