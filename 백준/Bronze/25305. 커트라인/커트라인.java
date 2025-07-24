import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
//    static int arr[][] = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr = Arrays.stream(arr)            // IntStream 생성
                .boxed()                  // Integer로 Boxing
                .sorted(Collections.reverseOrder()) // 내림차순 정렬
                .mapToInt(Integer::intValue)        // 다시 int로
                .toArray();              // int[]로 변환

        sb.append(arr[k-1]);
        System.out.println(sb);
    }
}