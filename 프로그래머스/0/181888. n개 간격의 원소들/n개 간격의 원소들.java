class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length + n - 1) / n;

        int[] answer = new int[len];
        int count = 0;

        for (int i = 0; i < num_list.length; i += n) {
            answer[count] = num_list[i];
            count++;
        }

        return answer;
    }
}