import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];
        HashSet<String> bear = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("ENTER")) {
                bear.clear();
            } else {
                if(!bear.contains(arr[i])){
                    count++;
                    bear.add(arr[i]);
                }
            }
        }
        System.out.println(count);
    }
}