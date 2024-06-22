import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> JosephusQue = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Josephus(n, k);
    }

    public static void Josephus(int n, int k) {
        for (int i = 1; i <= n ; i++) {
            JosephusQue.add(i);
        }
        while(!(JosephusQue.size() == 1)){
            for(int i=0 ;i<k-1; i++){
                JosephusQue.addLast(JosephusQue.poll());
            }
            sb.append(JosephusQue.poll()).append(", ");
        }
        sb.append(JosephusQue.poll());
        System.out.println("<"+sb+">");
    }

}