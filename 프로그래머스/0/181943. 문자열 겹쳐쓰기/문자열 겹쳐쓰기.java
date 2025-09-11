import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        int n = overwrite_string.length();
        
        for(int i=0; i<my_string.length(); i++){
            if (i >= s && i < s + n) {
                answer.append(overwrite_string.charAt(i - s));
            } else {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}