import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> res = new ArrayList<>();

        // 0 포함 여부 (0은 유일하게 "선행 0" 이슈 없이 허용)
        if (l <= 0 && 0 <= r) {
            res.add(0);
        }

        // BFS로 0/5 수 생성 (선행 0 방지: 시작을 5로)
        Deque<Long> q = new ArrayDeque<>();
        if (r >= 5) q.add(5L);

        while (!q.isEmpty()) {
            long cur = q.poll();
            if (cur > r) continue;       // 가지치기

            if (cur >= l) res.add((int)cur);

            long next0 = cur * 10;       // 뒤에 0 붙이기
            long next5 = cur * 10 + 5;   // 뒤에 5 붙이기

            if (next0 <= r) q.add(next0);
            if (next5 <= r) q.add(next5);
        }

        if (res.isEmpty()) return new int[]{-1};

        // 혹시 모를 순서 뒤섞임 방지
        Collections.sort(res);

        // List -> int[]
        int[] answer = new int[res.size()];
        for (int i = 0; i < res.size(); i++) answer[i] = res.get(i);
        return answer;
    }
}
