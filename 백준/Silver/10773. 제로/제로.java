import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> numStack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            if (in != 0) {
                result += numStack.push(in);
            } else {
                result -= numStack.pop();
            }
        }

        System.out.println(result);
    }
}