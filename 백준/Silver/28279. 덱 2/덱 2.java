import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> myQue = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    pollFirst();
                    break;
                case 4:
                    pollLast();
                    break;
                case 5:
                    size();
                    break;
                case 6:
                    isEmpty();
                    break;
                case 7:
                    peekFirst();
                    break;
                case 8:
                    peekLast();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void addFirst(int value) {
        myQue.addFirst(value);
    }
    public static void addLast(int value) {
        myQue.addLast(value);
    }

    public static void pollFirst() {
        if (!myQue.isEmpty()) {
            sb.append(myQue.pollFirst()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }
    public static void pollLast() {
        if (!myQue.isEmpty()) {
            sb.append(myQue.pollLast()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void size() {
        sb.append(myQue.size()).append("\n");
    }

    public static void isEmpty() {
        if (myQue.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public  static void peekFirst(){
        if (!myQue.isEmpty()) {
            sb.append(myQue.peek()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }
    public  static void peekLast(){
        if (!myQue.isEmpty()) {
            sb.append(myQue.peekLast()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }

    }
}