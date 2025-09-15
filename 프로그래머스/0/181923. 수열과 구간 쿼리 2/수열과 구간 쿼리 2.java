import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            List<Integer> list = new ArrayList<>();
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) list.add(arr[j]);
            }

            // answer[i] = list.isEmpty() ? -1 : Collections.min(list);
            if(list.isEmpty()){
                answer[i] = -1;
            } else{
                answer[i] = Collections.min(list);
            }
        }
        return answer;
    }
}
