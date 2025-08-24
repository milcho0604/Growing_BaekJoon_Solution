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
        int n = Integer.parseInt(br.readLine());
        // 저장할 리스트
        List<String[]> people = new ArrayList<>();
        // 춤추는 사람들
        Set<String> dancers = new HashSet<>();
        // 총총이 추가
        dancers.add("ChongChong");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // 하나씩 입력
            String a = st.nextToken();
            String b = st.nextToken();
            // 리스트에 추가
            people.add(new String[]{a,b});
        }

        for (int i = 0; i <people.size() ; i++) {
            if (dancers.contains(people.get(i)[0]) || dancers.contains(people.get(i)[1])) {
                dancers.add(people.get(i)[0]);
                dancers.add(people.get(i)[1]);
            }
        }
        System.out.println(dancers.size());
    }

}