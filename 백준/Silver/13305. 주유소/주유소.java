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

//        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine()); // 테스트 케이스(도시)
        
        long[] distance = new long[n - 1]; // 도시마다 거리
        long[] price = new long[n]; // 각 도시 주유소의 가격

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long minPrice = price[0];
        for (int i = 0; i < n-1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            sum += minPrice * distance[i];
        }
        System.out.println(sum);
    }
}
