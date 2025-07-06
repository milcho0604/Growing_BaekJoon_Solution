import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int arr[][] = new int[30][30];

    public static void main(String[] args) throws IOException {
        // 서쪽 n개 동쪽 m개 사이트, 서쪽의 사이트 개수만큼 (N개) 다리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(solve(n, m)).append("\n");
        }

        System.out.println(sb);
    }

    // 재귀 함수
    private static int solve(int n, int m){
        if (n > m) return 0;

        if (n == 0 || n == m) return 1;

        if (arr[n][m] > 0) return arr[n][m];

        return arr[n][m] = solve(n - 1, m - 1) + solve(n, m - 1);
    }

}