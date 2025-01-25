import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine());
            sb.append(findNextPrime(m)).append("\n");
        }
        System.out.print(sb);
    }

    public static long findNextPrime(long m) {
        long primeNumber = m;
        while (!isPrime(primeNumber)) {
            primeNumber++;
        }
        return primeNumber;
    }

    public static boolean isPrime(long m) {
        if (m <= 1) {
            return false;
        }
        if (m <= 3) {
            return true;
        }
        if (m % 2 == 0 || m % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= m; i += 6) {
            if (m % i == 0 || m % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
