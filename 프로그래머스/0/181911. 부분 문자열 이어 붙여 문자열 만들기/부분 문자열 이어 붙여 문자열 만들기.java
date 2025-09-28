class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i < my_strings.length; i++){
            String str = my_strings[i];
            int num1 = parts[i][0];
            int num2 = parts[i][1];
            for(int j=num1; j<=num2; j++){
                char ch = str.charAt(j);
                answer.append(ch);
            }
        }
        return String.valueOf(answer);
    }
}