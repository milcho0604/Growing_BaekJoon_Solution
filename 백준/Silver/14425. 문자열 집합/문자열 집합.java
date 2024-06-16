import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);
        int count =0;
        Map<String,Integer> myMap = new HashMap<>();
        for(int i=0; i<n; i++){
            myMap.put(br.readLine(), i);
        }
        
        for(int i=0; i<m; i++){
            if(myMap.containsKey(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}