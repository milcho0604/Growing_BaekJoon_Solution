import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());  // 자를 횟수
        long m = Long.parseLong(st.nextToken());  // 원하는 수

        // 이분탐색 메서드 호출
        binarySearch(n, m);

        // 결과 출력
        System.out.println(sb);
    }

    private static void binarySearch(long n, long m) {
        long left = 0;  // 시작값
        long right = n - 1; // 끝값

        while (left <= right) {
            long mid = (left + right) / 2;  // 중간값 계산(자르는 지점의 인덱스)
            long value = n - mid;           // 자를 횟수에서 중간값을 뺀 값(자르고 난 후 남은 부분의 길이)
            
//            목표값 계산(개수 계산이라는 것을 위해 +1을 함)
//            아래 target은 구글링을 통해 얻은 계산
            long target = (mid + 1) * (value + 1);
//            System.out.println(target);
            if (target == m) {
                sb.append("YES");
                return;
            } else if (target > m) {
                right = mid - 1;  // 목표값이 크면 오른쪽에 +1
            } else {
                left = mid + 1;  // 목표값이 작으면 왼쪽에 +1
            }
        }
        sb.append("NO");
    }
}