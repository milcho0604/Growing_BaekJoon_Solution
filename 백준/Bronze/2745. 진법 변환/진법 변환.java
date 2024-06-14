import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st =new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int a = Integer.parseInt(st.nextToken());

        int temp = 1;
        int sum = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);

            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * temp;
            } else {
                sum += (c - '0') * temp;
            }
            temp *= a;
        }
        System.out.println(sum);
    }
}
