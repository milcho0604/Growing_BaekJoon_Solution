import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] visit;         // 방문 여부를 파악할 visit 배열
    static int[][] arr;             // 간선의 정보를 저장할 배열
    static int n;                   // 입력할 정점의 개수
    static int m;                   // 입력할 간선의 개수
    static int start;               // 탐색을 시작할 노드
    static Queue<Integer> queue;    // bfs에서 사용할 queue선언
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());    // 정점
        m = Integer.parseInt(st.nextToken());    // 간선
        start = Integer.parseInt(st.nextToken());// 시작 위치

        arr = new int[1001][1001];  // 올바른 좌표를 받기 위해 +1, 0부터 시작하기 때문에 n+1도 가능
        visit = new boolean[1001];  // boolean의 default = false


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());   // 간선을 입력
            int y = Integer.parseInt(st.nextToken());   // 간선을 입력
            arr[x][y] = arr[y][x] = 1;                  // 간선의 방향은 중요하지 않기 때문에 x,y = y,x 모두 true
        }                                               // arr[x][y] = 1을 설정해야 =1을 해야 간선이 끊기지 않고 존재한다는 것을 체크할 수 있음

        dfs(start);                     // dfs 호출

        System.out.println();           // 출력 조건을 지키기 위해 줄바꿈

        Arrays.fill(visit, false);  // dfs호출로 이미 배열을 사용했기 때문에 다시 초기화
                                        // visit = new boolean[1001]과 같음

        bfs(start);                     // bfs 호출

    }

    // dfs는 재귀호출을 사용해 구현
    public static void dfs(int start) {

        visit[start] = true;                // 이미 방문한 배열을 true로 초기화. true는 이미 방문한 배열을 의미
        System.out.print(start + " ");      // 방문한 노드 출력

        for (int i = 1; i <= n; i++) {
            if (!visit[i] && arr[start][i] == 1) {  // 조건에 방문한 적이 없다는 것과 함께 간선이 이어진 상태라는 것을 넣어줘야함.
                dfs(i);                             // 방문하지 않았고 간선이 있다면 dfs 호출
            }
        }

    }

    // bfs는 큐를 사용해 구현
    public static void bfs(int start) {
        queue = new LinkedList<Integer>();              // queue 사용
        queue.offer(start);                             // queue.add가 아닌 offer를 사용 add는 큐가 전부 찬 경우 예외가 발생하지만,
                                                        //                           offer는 false를 리턴한다. (중요!)
        visit[start] = true;                            // dfs와 마찬가지로 true로 초기화. 이미 방문한 것을 의미
        System.out.print(start + " ");                  // 처음 start만 출력

        while (!queue.isEmpty()) {                      // queue가 비어있지 않았다면 계속 탐색
            int temp = queue.poll();                    // for문에 넣으면 NullPointException 발생
                                                        // queue에서 노드를 하나 꺼내 temp에 저장 temp의 인접 노드를 탐색, 다음에 탐색할 노드
            for (int i = 1; i <= n; i++) {
                if (!visit[i] && arr[temp][i] == 1) {   // 방문한 적이 없다면 if문을 실행(visit[start] = false)라면 + 간선이 존재해야(temp와 i가 이어져있다면)
                    queue.offer(i);                     // queue에 인접한 정점을 추가. 즉, 방문했음을 의미
                    visit[i] = true;                    // 방문했음을 표시
                    System.out.print(i + " ");          // start 이후 방문한 노드를 출력
                }
            }
        }
    }
}
