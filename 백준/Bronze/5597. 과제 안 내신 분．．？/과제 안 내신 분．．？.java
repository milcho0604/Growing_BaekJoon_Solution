import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int arr[][] = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[31];
        for (int i = 1; i <= 28; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[temp] = 1;
        }
        for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }

}