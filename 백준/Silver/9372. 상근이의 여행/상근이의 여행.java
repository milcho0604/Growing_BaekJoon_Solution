import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;  // 국가
        int m;  // 비행기
        int count;
        boolean[] visit; // 방문

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        while (T-- > 0) {

            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            ArrayList<Integer>[] list;
            list = new ArrayList[n+1];
            visit = new boolean[n+1];

            for (int i=0; i<=n; i++) {
                list[i] = new ArrayList<>();
            }

            for (int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                list[a].add(b);
                list[b].add(a);
            }

            sb.append(n-1).append("\n");


        }//while

        System.out.print(sb);

    }
}