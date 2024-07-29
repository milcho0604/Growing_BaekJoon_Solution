import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = reader.readLine().toCharArray();
        }

        int maxFriend = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'Y') {
                    if (!visited[j]) {
                        visited[j] = true;
                        count++;
                    }
                    for (int k = 0; k < n; k++) {
                        if (arr[j][k] == 'Y' && k != i && !visited[k]) {
                            visited[k] = true;
                            count++;
                        }
                    }
                }
            }
            maxFriend = Math.max(maxFriend, count);
        }

        System.out.println(maxFriend);
    }
}
