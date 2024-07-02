import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    // 문제 자체를 이해하지 못해서 블로그를 참고하여 풀이하였음

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Character> myList = new ArrayList<>();

        while (n > 0) {
            if (n % m < 10) {
                myList.add((char) (n % m  + '0'));
            } else {
                myList.add((char) (n % m - 10 + 'A'));
            }
            n /= m;
        }
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.print(myList.get(i));
        }

    }
}
