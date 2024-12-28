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

//        st = new StringTokenizer(br.readLine());
        // 수
//        int n = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        // 결과(한수)
        int count = 0;

        int start = 1;

        while(start <= n){
            if (isHansu(start)){
                count++;
            }
            start++;
        }

        System.out.println(count);

    }
    public static boolean isHansu(int start) {
        // 1~99는 모두 한수
        if (start < 100) {
            return true;
        }

        // 한수의 조건: 두 번째 자리와 마지막 자리의 차이가 일치
        int num = (start / 10 % 10) - (start % 10);
        while (start >= 10) {
            int last = start % 10;
            start /= 10;
            int second = start % 10;

            if ((second - last) != num) {
                return false;
            }
        }

        return true;
    }
}