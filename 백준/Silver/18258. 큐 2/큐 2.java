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
            String order = st.nextToken();
            switch (order) {
                case "push":
                    pushQue(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pollQue();
                    break;
                case "size":
                    sizeQue();
                    break;
                case "empty":
                    isEmptyQue();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void pushQue(int value) {
        myQue.add(value);
    }

    public static void pollQue() {
        if (!myQue.isEmpty()) {
            sb.append(myQue.poll()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void sizeQue() {
        sb.append(myQue.size()).append("\n");
    }

    public static void isEmptyQue() {
        if (myQue.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public  static void front(){
        if (!myQue.isEmpty()) {
            sb.append(myQue.peek()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }
    
    public  static void back(){
        if (!myQue.isEmpty()) {
            sb.append(myQue.peekLast()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }

    }
}