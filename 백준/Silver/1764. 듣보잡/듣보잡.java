import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            mySet.add(br.readLine());
        }
        int count = 0;
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < mySet.size(); i++) {
            String str = br.readLine();
            if (mySet.contains(str)) {
                myList.add(str);
                count++;
            }
        }
        myList.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myList.size(); i++) {
            sb.append(myList.get(i)).append("\n");
        }
        System.out.println(count);
        System.out.println(sb);
    }

}
