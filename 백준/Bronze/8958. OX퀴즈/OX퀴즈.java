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

        String temp;
        for (int i = 0; i < n; i++) {
            temp = String.valueOf(br.readLine());
            int count = 0;
            int sum = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }

}