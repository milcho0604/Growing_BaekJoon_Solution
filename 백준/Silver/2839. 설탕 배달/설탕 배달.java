import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        if (n == 1 || n == 2 || n == 4 || n ==7) {
            System.out.println(-1);             //그 외 값은 -1
        } else if (n % 5 == 1 || n % 5 == 3) {  // 5로 나눈 나머지가 1 또는 3이면
            System.out.println((n / 5) + 1);    // 5로 나눈 몫에다가 +1
        } else if (n % 5 == 2 || n % 5 == 4) {  // 5로 나눈 나머지가 2또는 4이면
            System.out.println((n / 5) + 2);    // 5로 나눈 몫에다가 +2
        } else if (n % 5 == 0) {                // 5로 나눈 나머지가 0이면
            System.out.println(n / 5);          // 5로 나누고 끝
        }
    }
}
