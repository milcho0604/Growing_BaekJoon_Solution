import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        Queue<Integer> myQue = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            myQue.add(work);
        }
        
        while (n > 0 && !myQue.isEmpty()) {
            int maxWork = myQue.poll();
            if (maxWork > 0) {
                myQue.add(maxWork - 1);
            }
            n--;
        }
        
        long result = 0;
        while (!myQue.isEmpty()) {
            int work = myQue.poll();
            result += (long) work * work;
        }
        
        return result;
    }
}
