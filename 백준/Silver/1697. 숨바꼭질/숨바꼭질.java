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
        n = Integer.parseInt(st.nextToken());    // 수빈이 위치
        k = Integer.parseInt(st.nextToken());    // 동생의 위치
        if (n == k) {
            System.out.println(0);
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
        arr[n] = 0;                             // 수빈이의 위치는 0으로 초기화 수빈이의 위치만 방문했음을 의미

        while (!queue.isEmpty()) {              // queue가 비어있지 않았다면 계속 탐색
            int now = queue.poll();             // for문에 넣으면 NullPointException 발생
            for (int i = 0; i < 3; i++) {
                int where;                      // 수빈이가 이동할 수 있는 방법

                // 수빈이가 이동 가능한 방법들(경우의 수)
                if(i == 0){                     // i=0인 경우는 x-1
                    where = now-1;                  // 처음 수빈이의 위치가 5라고 하면 where = 4
                } else if (i == 1) {            // i=1인 경우는 x+1
                    where = now+1;                  // 처음 수빈이의 위치가 5라고 하면 where = 6
                }else{                          // i=2인 경우는 x*2
                    where = now*2;                  // 처음 수빈이의 위치가 5라고 하면 where = 10
                }
                if(where >= 0 && where <= 100000 && arr[where] == -1){  // 아직 이동하지 않은 위치라면 수빈이는 그 위치로 이동
                                                                        // where 범위를 설정하지 않으면 런타임 에러 발. where의 값이 배열의 범위를 벗어날 수 있음
                    arr[where] = arr[now]+1;    // 수빈이가 이동한 위치를 +1하면서 이동했음을 표시
                    queue.offer(where);         // 이동한 수빈이의 위치를 큐에서 뺀다
                    if(where == k){             // 수빈이가 이동한 위치가 동생의 위치와 같다면
                        return arr[where];      // 현재 수빈이의 위치를 return
                    }
                }

            }
        }
        return n;   // 왜 여기서 return n을 해야하는지 의문, 인텔리제이에서 하라니까 했는데 왜??
                    // 하지 않으면 return arr[where]에서 오류가 발생
    }
}
