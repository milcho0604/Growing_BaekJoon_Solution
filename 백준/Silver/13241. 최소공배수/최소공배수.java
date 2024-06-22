import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken()); 
        long b = Long.parseLong(st.nextToken()); 
        commonMultiple(a, b);
        System.out.println(sb); 
    }

    public static void commonMultiple(long a, long b) throws IOException {
        long max = calculate(a, b);
        long min = (a * b) / max;
        sb.append(min).append("\n");
    }

    public static long calculate(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
