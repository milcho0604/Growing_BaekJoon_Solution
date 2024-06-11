import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 N과 M을 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        // 체스판 입력 받기
        char[][] chess = new char[N][M];
        for (int i = 0; i < N; i++) {
            chess[i] = br.readLine().toCharArray();
        }

        // 8x8 부분을 검사하여 최소 칠하기 수 계산
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int paint = countPaint(chess, i, j);
                min = Math.min(min, paint);
            }
        }

        // 결과 출력
        System.out.println(min);
    }

    public static int countPaint(char[][] chess, int x, int y) {
        int white = 0;
        int black = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char now = chess[x + i][y + j];
                // 흰색부터 시작
                char whiteStart = ((i + j) % 2 == 0) ? 'W' : 'B';
                // 검은색부터 시작
                char blackStart = ((i + j) % 2 == 0) ? 'B' : 'W';

                // 흰색 시작과 현재 체스판을 비교
                if (now != whiteStart) {
                    white++;
                }
                // 검은색 시작과 현재 체스판을 비교
                if (now != blackStart) {
                    black++;
                }
            }
        }

        // 최소로 색칠하는 수 반환
        return Math.min(white, black);
    }
}
