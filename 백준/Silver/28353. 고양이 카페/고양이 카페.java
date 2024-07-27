import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 고양이 수
        int k = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        int[] weights = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = getMaxHappierCount(n, k, weights);
        System.out.println(result);
    }


    public static int getMaxHappierCount(int n, int k, int[] weights) {
        Arrays.sort(weights); // 고양이 무게를 오름차순으로 정렬
        int left = 0; // 가장 가벼운 고양이의 인덱스
        int right = n - 1; // 가장 무거운 고양이의 인덱스
        int maxHappier = 0; // 결과값, 행복할 수 있는 사람

        while (left < right) {
            if (weights[left] + weights[right] <= k) {
                // 두 고양이의 무게 합이 버틸 수 있는 무게 이하인 경우
                maxHappier++;
                left++;
                right--;
            } else {
                // 무게 합이 버틸 수 있는 무게를 초과하는 경우
                right--;
            }
        }
        return maxHappier;
    }
}
