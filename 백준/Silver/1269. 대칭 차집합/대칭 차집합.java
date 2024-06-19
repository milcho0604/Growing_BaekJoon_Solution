import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);

        Set<Integer> mySet1 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            mySet1.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> mySet2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mySet2.add(Integer.parseInt(st.nextToken()));
        }

        int countA = 0;
        int countB = 0;

        for(int num : mySet1){
            if(!mySet2.contains(num)){
                countA++;
            }
        }
        for(int num : mySet2){
            if(!mySet1.contains(num)){
                countB++;
            }
        }
//        System.out.println(countA);
//        System.out.println(countB);
        System.out.println(countA+countB);
    }
}
