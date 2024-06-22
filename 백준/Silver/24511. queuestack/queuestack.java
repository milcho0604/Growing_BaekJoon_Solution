import java.io.*;
import java.util.*;

// 처음에 카드 2문제와 같은 형식으로 문제를 풀었다가 다른 방식으로 문제를 풀어야 한다는 생각을 갖게 되었다.
// 처음엔 배열에다가 값을 담아서 배열의 index와 비교를 하면서 구현을 하려고 했지만 실패했고
// 어떤 방식으로 접근해야하는지 구글링을 했다.
public class Main {
    static Deque<Integer> myque = new ArrayDeque<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        queueStack();
    }

    private static void queueStack() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int structure[] = new int[n];   // 자료구조 목록을 담을 배열
        int value[] = new int[n];       // 자려구조 값을 담을 배열(1개의 자료구조 1개의 값 할당)

//        자료구조 목록 0 : 큐, 1 : 스택 (n개 만큼의 자료구조가 주어진다)
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            structure[i] = Integer.parseInt(st.nextToken());
        }
//        자료구조의 값, 여기서 값은 1개의 자료구조에 1개의 값만 할당된다.
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            value[i] = Integer.parseInt(st.nextToken());
        }

//        삽입할 데이터의 수
        int m = Integer.parseInt(br.readLine());
        int insert[] = new int[m];   // 삽입할 데이터를 담을 배열
//        삽입할 값의 목록
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            insert[i] = Integer.parseInt(st.nextToken());
        }

//        스택은 LIFO의 구조를 가져서, FIFO의 구조를 가진 큐만 따져도 문제를 해결할 수 있다
        for(int i=0; i<n; i++){
            if(structure[i]==0){             // 자료구조의 타입이 큐인 경우라면
                myque.addFirst(value[i]);    // 큐의 값을(0인 경우에 할당된 값을) 새로 만든 큐에 담아준다
            }
        }

//        큐에다가 새로운 원소를 넣고, 이후에 바로 원소를 pop하는 과정
        for(int i=0; i<m; i++){
            myque.addLast(insert[i]);                   // 큐에 삽입할 값을 넣어준다
            sb.append(myque.pollFirst()).append(" ");   // 삽입한 뒤 큐에서 원소를 pop하고 그 원소를 sb에 넣어준다
        }
        System.out.println(sb);
    }

}