class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = n;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}