import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        Set<String> mySet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                mySet.add(str.substring(i, j));
                // 예를 들어, i=0이고 j=1이라면 substring(0,1),(0,2),(0,3),(0,4),...(1,2),... 이와 같은 방법으로 반복
            }
        }
        System.out.println(mySet.size());
//        System.out.println(mySet);
    }
}
