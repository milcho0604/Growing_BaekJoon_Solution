import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean shouldDelete = false;

            for (int j = 0; j < delete_list.length; j++) {
                if (temp == delete_list[j]) {
                    shouldDelete = true;
                    break;
                }
            }

            if (!shouldDelete) {
                resultList.add(temp);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}