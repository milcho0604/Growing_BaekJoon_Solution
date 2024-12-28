import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        // 라운드
        int n = Integer.parseInt(st.nextToken());
        // player 1
        int p1 = Integer.parseInt(st.nextToken());
        // player 2
        int p2 = Integer.parseInt(st.nextToken());
        // 결과
        int count = 0;

        while(p1 != p2){
            // 라운드를 이기면 /2 그리고 거기서 나의 순서를 구하기 때문에 %2
            p1 = p1/2 + p1%2;
            p2 = p2/2 + p2%2;

            count ++;
        }
        System.out.println(count);



    }
}