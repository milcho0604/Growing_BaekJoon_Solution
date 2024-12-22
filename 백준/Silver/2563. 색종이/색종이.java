import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] myArr = new int[100][100];
        int x, y;
        int count = 0;

        for (int i=0; i<myArr.length; i++){
            for(int j=0; j< myArr.length; j++){
                myArr[i][j] = 0;
            }
        }

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if(j<100 && k<100) {
                        if (myArr[j][k] == 0) {
                            myArr[j][k] =1;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
