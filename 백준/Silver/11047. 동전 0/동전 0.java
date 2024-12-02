import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

//        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(st.nextToken()); // 테스트 케이스
        int sum = Integer.parseInt(st.nextToken()); // 목표
        int[] arr = new int[n]; // 값을 저장할 배열

//        String[] spl = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int count = 0;
        for (int i = n - 1; i >= 0; i--) { // 큰 동전부터 사용
            if (arr[i] <= sum) {
                count += sum / arr[i];
                sum %= arr[i]; // 남은 금액 변경
            }
        }

        System.out.println(count);

    }
}
