class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i < index_list.length; i++){
            int num = index_list[i];
            char ch = my_string.charAt(num);
            answer.append(ch);
        }
        // System.out.println(answer);
        return String.valueOf(answer);
    }
}