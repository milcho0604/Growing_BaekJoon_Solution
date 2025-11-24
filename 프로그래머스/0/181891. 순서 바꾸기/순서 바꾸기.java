import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        List<Integer> list = new ArrayList<>();
        for(int i=n; i<len; i++){
            list.add(num_list[i]);
        }
        for(int i=0; i<n; i++){
            list.add(num_list[i]);
        }
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}