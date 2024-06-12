import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int count = 0;
        int sum = 0;
        Queue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            que.add(scoville[i]);
        }

        while (que.peek() < K) {
            if(que.size()<2){
                return answer = -1;
            }
            
            int food1 = que.poll();
            int food2 = que.poll();

            sum = food1 + (food2 * 2);
            que.add(sum);
            count++;
        
    }

        answer = count;
        return answer;
    }
}
