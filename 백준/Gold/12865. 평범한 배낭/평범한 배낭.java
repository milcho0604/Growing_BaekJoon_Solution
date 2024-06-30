import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int count = Integer.parseInt(input[0]);
        int maxKg = Integer.parseInt(input[1]);

        Map<Integer, int[]> items = new HashMap<>();

//        맵에 아이템의 무게와 가치를 추가한다
        for (int i = 1; i <= count; i++) {
            input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int value = Integer.parseInt(input[1]);
//            이 부분은 처음에 weight, value로 넣었는데 이렇게 하면 오류가 떠서 구글링을 통해 수정하였음.
            items.put(i, new int[]{weight, value});
        }

        int[][] dp = new int[count + 1][maxKg + 1];

        for (int i = 1; i <= count; i++) {          // 물건의 개수
            for (int j = 1; j <= maxKg; j++) {      // 최대 무게
                dp[i][j] = dp[i - 1][j];            // i번째 물건을 포함하지 않는 경우, 다시 말해 현재 아이템을 포함하지 않는 것을 의미
                int[] nowItem = items.get(i);       // 맵에서 현재 아이템을 받아온다. (여기서 현재는 다음이라고 봐도 무방할 것 같음)
                int weight = nowItem[0];
                int value = nowItem[1];
                if (j - weight >= 0) {              // 주어진 무게에서 현재 무게를 빼도 0이 아니라면, 즉 무게를 초과하지 않는다면!
                    // 현재 아이템을 더하지 않은 경우(dp[i-1][j])와 더한 경우(value + dp[i-1][j-weight])
                    // 중 더 큰 값을 선택하여 dp[i][j]에 저장
                    dp[i][j] = Math.max(dp[i - 1][j], value + dp[i - 1][j - weight]);
                }
            }
        }
        System.out.println(dp[count][maxKg]);
    }
}
