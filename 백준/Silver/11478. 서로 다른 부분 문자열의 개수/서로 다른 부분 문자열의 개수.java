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
            }
        }
        System.out.println(mySet.size());
//        System.out.println(mySet);
    }
}
