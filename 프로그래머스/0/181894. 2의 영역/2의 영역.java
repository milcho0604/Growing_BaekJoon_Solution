import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // 1. arr에서 값이 2인 모든 인덱스를 찾는다
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        
        // 2. 2가 한 번도 나오지 않으면 [-1] 반환
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        // 3. 최소, 최대 인덱스 구하기
        int minVal = Collections.min(list);
        int maxVal = Collections.max(list);
        
        // 4. minVal ~ maxVal까지의 값을 복사
        int len = maxVal - minVal + 1;
        int[] result = new int[len];
        
        int idx = 0;
        for (int i = minVal; i <= maxVal; i++) {
            result[idx++] = arr[i];
        }
        
        return result;
    }
}