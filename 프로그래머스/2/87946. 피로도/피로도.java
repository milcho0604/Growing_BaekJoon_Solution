class Solution {
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);
        return max;
    }

    private void dfs(int n, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) { // 최소 피로도 조건 확인
                visited[i] = true;
                dfs(n + 1, k - dungeons[i][1], dungeons); // 소모 피로도 반영
                visited[i] = false;
            }
        }
        if (n > max) {
            max = n;
        }
    }
}
