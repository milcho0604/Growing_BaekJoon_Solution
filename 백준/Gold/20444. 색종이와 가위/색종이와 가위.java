import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());  // 자를 횟수
        long m = Long.parseLong(st.nextToken());  // 원하는 수

//        이분탐색 메서드 호출
        binarySearch(n, m);
        System.out.println(sb);
    }

    private static void binarySearch(long n, long m) {
        long left = 0;  // 0부터 시작
        long right = n - 1; // 끝부터 시작

        while (left <= right) {
            long mid = (left + right) / 2;
            long value = n - mid;

            long target = (mid + 1) * (value + 1);
            if (target == m) {
                sb.append("YES");
                return;
            } else if (target > m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        sb.append("NO");
    }
}
