import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int k;
    static Queue<Integer> queue;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   // 수빈이 위치
        k = Integer.parseInt(st.nextToken());   // 동생의 위치
        if (n == k) {                           // 처음 입력된 수빈이의 위치와 동생의 위치가 같은 경우
            System.out.println(0);              // 0초
        }
        else {
            System.out.println(bfs(n,k));
        }
    }
    // bfs는 큐를 사용해 구현
    public static int bfs(int n, int k) {
        queue = new LinkedList<Integer>();
        int[] arr = new int[100001];            // 최대 범위
        queue.offer(n);                         // 시작위치 즉, 수빈이의 위치를 큐에 추가

        Arrays.fill(arr, -1);               // 모든 배열을 -1로 초기화 -1은 방문하지 않은 위치
        arr[n] = 0;                             // 시작위치의 시간을 0으초 초기화 5를 입력받으므로 수빈이의 위치 5가 시간 0에서 시작

        while (!queue.isEmpty()) {              // queue가 비어있지 않았다면 계속 탐색
            int now = queue.poll();             // 현재 위치를 큐에서 꺼냄, 이 위치는 now(5)
            for (int i = 0; i < 3; i++) {
                int where;                      // 수빈이가 다음에 이동할 위치

                // 수빈이가 이동 가능한 방법들(경우의 수)
                if(i == 0){                     // i=0인 경우는 x-1
                    where = now-1;                  // 처음 수빈이의 위치가 5라고 하면 where = 4
                } else if (i == 1) {            // i=1인 경우는 x+1
                    where = now+1;                  // 처음 수빈이의 위치가 5라고 하면 where = 6
                }else{                          // i=2인 경우는 x*2
                    where = now*2;                  // 처음 수빈이의 위치가 5라고 하면 where = 10
                }
                if(where >= 0 && where <= 100000 && arr[where] == -1){  // 아직 이동하지 않은 위치라면 수빈이는 그 위치로 이동
                                                                        // where 범위를 설정하지 않으면 런타임 에러 발생. where의 값이 배열의 범위를 벗어날 수 있음
                    arr[where] = arr[now]+1;    // 수빈이가 where까지 도달하는 시간으로 now+1, 첫 now=0, 현재 위치에서 +1초를 의미
                    queue.offer(where);         // 이동한 수빈이의 위치를 큐에 추가
                    if(where == k){             // 수빈이가 이동한 위치가 동생의 위치와 같다면
                        return arr[where];      // 현재 수빈이의 위치까지 걸린 시간을 return(이동 횟수라고 봐도 무방할 것 같음)
                    }
                }

            }
        }
        return n;   // 왜 여기서 return n을 해야하는지 의문, 인텔리제이에서 하라니까 했는데 왜??
                    // 하지 않으면 return arr[where]에서 오류가 발생
    }
}
