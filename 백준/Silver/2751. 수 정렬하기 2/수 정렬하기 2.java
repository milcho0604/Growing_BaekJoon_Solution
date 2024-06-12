import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> myArr = new ArrayList<>();
        for(int i=0; i<n;i ++){
            myArr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(myArr);
        for(int i=0; i< myArr.size();i++){
            sb.append(myArr.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}