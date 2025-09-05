class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num-end_num;
        int[] answer = new int[len+1];
        int temp =0;
        for(int i=start_num; i>=end_num; i--){
            answer[temp] = i;
            temp++;
        }
        return answer;
    }
}