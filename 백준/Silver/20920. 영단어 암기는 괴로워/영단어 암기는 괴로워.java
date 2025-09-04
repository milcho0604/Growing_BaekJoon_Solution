import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<Integer> myQue = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine().trim();
            // 문자열 길이가 m보다 크고
            if (str.length() >= m) {
//                map.put(str, map.getOrDefault(str, 0) + 1);
                // map이 이미 str이라는 key 문자열을 이미 갖고 있다면
                if (map.containsKey(str)) {
//                     map에 value만 ++
                    map.put(str, map.get(str) + 1); // value 증가
                } else {
                    // 그렇지 않다면 map에 key value를 넣어줌 (value는 default 1로)
                  map.put(str, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> {
            // 1. 빈도수 내림차순
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            // 2. 단어 길이 내림차순
            if (a.getKey().length() != b.getKey().length()) {
                return b.getKey().length() - a.getKey().length();
            }
            // 3. 사전순 오름차순
            return a.getKey().compareTo(b.getKey());
        });
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getKey() + "\n");
        }
        System.out.println(sb.toString());
    }
}
