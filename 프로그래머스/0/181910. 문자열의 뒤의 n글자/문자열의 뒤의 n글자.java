class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        int len = my_string.length();
        for(int i=len-n; i<len; i++){
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}