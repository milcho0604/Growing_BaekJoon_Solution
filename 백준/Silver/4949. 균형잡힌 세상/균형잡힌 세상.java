import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //  프로그래머스에서 거의 유사한 문제를 풀었기 때문에, 그 형식을 따르겠다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력받을 숫자가 없기에 while문으로 무한반복을 시켜주고 종료할 조건을 제시한다
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            if (check(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }

    public static boolean check(String str) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char checkChar = str.charAt(i);
            if (checkChar == '(' || checkChar == '[') {
                myStack.push(checkChar);
            } else if (checkChar == ')') {
                if (myStack.isEmpty() || myStack.pop() != '(') {
                    return false;
                }
            } else if (checkChar == ']') {
                if (myStack.isEmpty() || myStack.pop() != '[') {
                    return false;
                }
            }
        }
        return myStack.isEmpty() == true;   // 결국 스택이 비어있어야 올바른 괄호라는 것을 말한다. 만약 비어있지 않고 남아있다면,
                                            // 짝이 맞지 않다는 것을 말하는 것이기 때문이다.
    }
}

