class Solution {
    public String solution(String my_string, String letter) {
        
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "abcdef";
        String letter = "f";
        String result = solution.solution(my_string, letter);
        System.out.println(result);  
    }
}
