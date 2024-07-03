import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] dx = {-1, 1, 0, 0};   // 좌우
    static int[] dy = {0, 0, -1, 1};   // 상하
    static boolean[][] visited;
    static int[][] farm;
    static int n, m;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        List<Integer> countList = new ArrayList<>();    // 테스트 케이스로 몇개의 결과가 들어올지 모르니 리스트로 결과를 담고 반환하기

        for (int test = 0; test < t; test++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이
            n = Integer.parseInt(st.nextToken()); // 배추밭의 세로 길이
            int k = Integer.parseInt(st.nextToken()); // 배추가 심어진 위치의 개수

            farm = new int[n][m];
            visited = new boolean[n][m];
            int count = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());   // 배추가 심어진 x 좌표
                int y = Integer.parseInt(st.nextToken());   // 배추가 심어진 y 좌표
                farm[y][x] = 1; // 심어진 부분은 1로 변경
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && farm[i][j] == 1) { // 방문하지 않았고, 배추가 심어졌다면?
                        dfs(i, j);  // dfs호출
                        count++;    // count 증가
                    }
                }
            }
            countList.add(count);
        }
//        결과 출력
        for (int count : countList) {
            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && farm[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
