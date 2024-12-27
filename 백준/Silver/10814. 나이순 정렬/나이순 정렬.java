import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        String[] spl = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = String.valueOf(i);
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age = Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
                if (age != 0){
                    return age;
                }else {
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
            }
        });
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ")
                    .append(arr[i][1]).append(" ").append("\n");
        }
        System.out.println(sb.toString());
    }
}
