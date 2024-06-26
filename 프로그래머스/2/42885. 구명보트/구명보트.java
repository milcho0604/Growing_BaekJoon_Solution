import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : people) {
            deque.add(i);
        }
        int boat = 0;

        while(!deque.isEmpty()){
            int last = deque.pollLast();
            boat ++;
            if (!deque.isEmpty() && last + deque.peekFirst() <= limit ) {
                deque.pollFirst();
            }
        }
        return boat;
    }
}