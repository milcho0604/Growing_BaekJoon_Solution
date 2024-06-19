import java.io.*;
import java.util.*;

public class Main {
    static Stack<Integer> myStack = new Stack<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            switch (order) {
                case 1:
                    int message = Integer.parseInt(st.nextToken());
                    pushStack(message);
                    break;
                case 2:
                    popStack();
                    break;
                case 3:
                    sizeStack();
                    break;
                case 4:
                    isEmptyStack();
                    break;
                case 5:
                    peekStack();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void pushStack(int value){
        myStack.push(value);
    }

    public static void popStack(){
        if (!myStack.isEmpty()) {
            sb.append(myStack.pop()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void sizeStack(){
        sb.append(myStack.size()).append("\n");
    }

    public static void isEmptyStack(){
        if (myStack.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public static void peekStack(){
        if (!myStack.isEmpty()) {
            sb.append(myStack.peek()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }
}
