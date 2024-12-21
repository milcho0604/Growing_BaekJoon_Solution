import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> cardQue = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        cardQue(n);
    }

    public static void cardQue(int n) {
        for (int i = 1; i <= n ; i++) {
            cardQue.add(i);
        }

        for (int i = 0; i < n; i++) {
            if(cardQue.size()>1) {
                cardQue.pollFirst();
                cardQue.addLast(cardQue.pollFirst());
            }
        }
        sb.append(cardQue.pollFirst());

        System.out.println(sb);
    }

}