import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
                List<int[]> myList = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = sequence[0];

        while (end < sequence.length) {
            if (sum == k) {
                myList.add(new int[]{start, end});
                sum -= sequence[start];
                start++;
            } else if (sum < k) {
                end++;
                if (end < sequence.length) {
                    sum += sequence[end];
                }
            } else {
                sum -= sequence[start];
                start++;
            }
        }
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]-o1[0]) - (o2[1]-o2[0]);
            }
        });

        int[] answer = myList.get(0);
        return answer;
    }
}