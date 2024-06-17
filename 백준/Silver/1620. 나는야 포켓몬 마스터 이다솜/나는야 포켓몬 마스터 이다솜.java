import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);

        Map<String, Integer> myMap1 = new HashMap<>();
        Map<Integer, String> myMap2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            int number = i+1;
            myMap1.put(name, number);
            myMap2.put(number, name);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            if(Character.isDigit(str.charAt(0))) {          // 입력받은 숫자가 문자인 숫자인지 확인 -> Character.isDigit str의 첫 문자가 숫자인지 문자인지 판별
                                                            // 숫자인지 먼저 확인
                int num = Integer.parseInt(str);            // 숫자라면 str을 숫자로 변환 -> 변환된 숫자를 myMap2에서 키로 사용
                sb.append(myMap2.get(num)).append("\n");    // 숫자인 경우
            }else {
                sb.append(myMap1.get(str)).append("\n");    // 문자인 경우
            }
        }
        System.out.println(sb);

    }
}
