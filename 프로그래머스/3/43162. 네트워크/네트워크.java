class Solution {
    static boolean visited[];
    static int count;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length + 1];
        count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(n, i, computers);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int n, int i, int[][] computers) {
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (!visited[j] && computers[i][j] == 1) {
                dfs(n, j, computers);
            }
        }
    }
}