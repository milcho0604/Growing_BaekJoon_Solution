import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int arr[][] = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int index = 0;
        int maxarr = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxarr){
                index = i;
                maxarr = arr[i];
            }
        }
        sb.append(maxarr).append("\n").append(index+1).append("\n");
        System.out.println(sb.toString());

    }

}