import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr= new int [n][2];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j< 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 이차원 배열은 Lamda를 사용하거나
        // 오버라이드를 통해 해결해야
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){                 // o1과 o2의 두 번째가 같다면
                    return o1[0]-o2[0];             // 첫 번째 숫자들을 기준으로 정렬 오름차순
                }
                else {                              // o1과 o2의 두 번째가 다르다면
                    return o1[1]-o2[1];             // 두 번째 숫자들을 기준으로 정렬 오름차순
                }
            }
        });
        for(int i=0; i< n; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
