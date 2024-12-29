import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int m = 666;
        int count =0;
        while(true){
            if(String.valueOf(m).contains("666")){
                count++;
            }
            if(n == count){
                break;
            }
            m++;
        }
        System.out.println(m);

    }
}