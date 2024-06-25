import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] order;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (List<Integer> list : adjList) {
            Collections.sort(list, Collections.reverseOrder());
        }

        visited = new boolean[n + 1];
        order = new int[n + 1];

        dfs(start);

        for (int i = 1; i <= n; i++) {
            System.out.println(order[i]);
        }
    }

    private static void dfs(int start) {
        visited[start] = true;
        order[start] = count++;
        
        for (int  target: adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
            }
        }
    }
}
