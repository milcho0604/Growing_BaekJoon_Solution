import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static int n, m;

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1, 0);
        System.out.println(sb);
    }

    private static void dfs(int start, int end) {
        if (end == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[end] = i;
            dfs(i + 1, end + 1);
        }
    }

}