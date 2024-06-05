import java.util.*;

class Main{
    static boolean[][] graph; // 값을 담을 2차원 배열
    static boolean[] visit; // 방문한 적이 있는 곳(재방문을 방지하기 위해서) 즉, 초기화
    static int n, m;
    static int result = 0;

    public static void dfs(int index) {
        if(visit[index])
            return;
        else{
            visit[index] = true;
            for(int i=1; i<=n; i++){
                if(graph[index][i]){
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();   // 정점의 수를 입력
        m = sc.nextInt();   // 간선의 수 입력

        graph = new boolean[n+1][n+1];  // n개의 인덱스까지(인덱스를 1부터 사용하기 위해서 +1) 1~n개까지
        visit = new boolean[n+1];       // 마찬가지이다.

        // 그래프 정보를 입력
        int x,y;
        for(int i=0; i<m; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;   // 입력된 그래프의 값을 참으로 설정
        }

        for(int i = 1; i<=n; i++){
            if(!visit[i]){
                dfs(i);
                result++;
            }
        }
        // dfs 및 결과 출력

        System.out.println(result);
    }
}