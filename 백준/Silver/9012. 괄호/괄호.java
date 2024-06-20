import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //  프로그래머스에서 거의 유사한 문제를 풀었기 때문에, 그 형식을 따르겠다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (check(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean check(String str) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                myStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (myStack.isEmpty() || myStack.pop() != '(') {
                    return false;
                }
            }
        }
        return myStack.isEmpty() == true;   // 결국 스택이 비어있어야 올바른 괄호라는 것을 말한다. 만약 비어있지 않고 남아있다면,
                                            // 짝이 맞지 않다는 것을 말하는 것이기 때문이다.
    }
}
