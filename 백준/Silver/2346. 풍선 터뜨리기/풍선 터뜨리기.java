import java.io.*;
import java.util.*;

// 처음에 카드 2문제와 같은 형식으로 문제를 풀었다가 다른 방식으로 문제를 풀어야 한다는 생각을 갖게 되었다.
// 처음엔 배열에다가 값을 담아서 배열의 index와 비교를 하면서 구현을 하려고 했지만 실패했고
// 어떤 방식으로 접근해야하는지 구글링을 했다.
public class Main {
    static Deque<Balloon> balloonQue = new ArrayDeque<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        balloon(n);
    }
    
    public static void balloon(int n) throws IOException {

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            balloonQue.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }
        Balloon balloons = balloonQue.pollFirst();
        sb.append(balloons.index).append(" ");

        while (!balloonQue.isEmpty()) {

            int location = balloons.move;

            if (location > 0) {
                for (int i = 0; i < location - 1; i++) {
                    balloonQue.add(balloonQue.poll());
                }
                balloons = balloonQue.pollFirst();
                sb.append(balloons.index).append(" ");
            } else {
                for (int i = 0; i < -location - 1; i++) {
                    balloonQue.addFirst(balloonQue.pollLast());
                }
                balloons = balloonQue.pollLast();
                sb.append(balloons.index).append(" ");
            }
        }
        System.out.println(sb);
    }
}
class Balloon {
    int index;
    int move;

    Balloon(int index, int move) {
        this.index = index;
        this.move = move;
    }
}
