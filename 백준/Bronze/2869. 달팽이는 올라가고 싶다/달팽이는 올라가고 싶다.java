import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   // 낮에 올라가는
        int B = Integer.parseInt(st.nextToken());   // 밤에 미끄러지는
        int V = Integer.parseInt(st.nextToken());   // 올라가려는

        int result = 0;
        if ((V - B) % (A - B) != 0) {
            result = (V - B) / (A - B) + 1;
        } else {
            result = (V - B) / (A - B);
        }
        System.out.println(result);
    }
}
