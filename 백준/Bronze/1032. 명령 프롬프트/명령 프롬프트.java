import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 파일의 개수 입력
        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            files[i] = br.readLine();
        }

        // config.sys를 기준으로 잡음 config.sys가 하나씩 잘려서 char 배열로 들어감.
        char[] pattern = files[0].toCharArray();

        // 각각 문자를 비교하는 과정 기준 문자와 다르면 ?로 대체할 것
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] != files[i].charAt(j)) {
                    pattern[j] = '?'; // 다른 경우 ?로 대체 ->
                    // 그럼 pattern 배열에서 c, o, f, i, g, u, r, e, ?, ?, ?, ?와 같은 형식으로 들어감
                }
            }
        }
        System.out.println(new String(pattern));
    }
}

//3
//        config.sys
//        config.inf
//        configures