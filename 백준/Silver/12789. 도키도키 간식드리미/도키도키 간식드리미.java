import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> myStack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            myStack.push(Integer.parseInt(st.nextToken()));
        }
        Collections.reverse(myStack); // 배열의 역순으로 스택에 push

        if (check(myStack, n)) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }

    public static boolean check(Stack<Integer> myStack, int n) {
        Stack<Integer> checkStack = new Stack<>();
        int start = 1;
        while (!myStack.isEmpty() || !checkStack.isEmpty()) {
            if (!myStack.isEmpty() && myStack.peek() == start) {
                myStack.pop();
                start++;
            } else if (!checkStack.isEmpty() && checkStack.peek() == start) {
                checkStack.pop();
                start++;
            } else if (!myStack.isEmpty()) {
                checkStack.push(myStack.pop());
            }else {
                return false;
            }
        }
        return start == n + 1;
    }
}

