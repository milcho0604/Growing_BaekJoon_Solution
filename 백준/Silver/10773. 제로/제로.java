//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//
//        Deque<Integer> de = new ArrayDeque<>();
//
//
//        for(int i=0; i<n; i++){
//
//        }
//
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> numStack = new Stack<>();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            if (in != 0) {
                numStack.push(in);
            } else {
                numStack.pop();
            }
        }

        int result = numStack.stream().reduce(0,(a, b) -> a + b);
        System.out.println(result);

    }
}