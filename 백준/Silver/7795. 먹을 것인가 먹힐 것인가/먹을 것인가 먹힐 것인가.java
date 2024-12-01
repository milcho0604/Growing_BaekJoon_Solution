import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        for (int i = 0; i < n; i++) {

            String[] spl = br.readLine().split(" ");
            int m = Integer.parseInt(spl[0]); // A 개수
            int k = Integer.parseInt(spl[1]); // B 개수


            int[] arrA = new int[m];
            int[] arrB = new int[k];

            // A배열
            String[] splA = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arrA[j] = Integer.parseInt(splA[j]);
            }

            // B배열
            String[] splB = br.readLine().split(" ");
            for (int j = 0; j < k; j++) {
                arrB[j] = Integer.parseInt(splB[j]);
            }
            sb.append(twoPointer(arrA, arrB)).append("\n");
        }
        // 결과 출력
        System.out.println(sb);
    }

    // 투포인터 함수 생성
    public static int twoPointer(int[] A, int[] B){
        // 크기 순서로 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        int count = 0;
        int start = 0;

        for (int i = 0; i < A.length; i++) {
            while (start < B.length && A[i] > B[start]) {
                start++;
            }
            count += start;
        }
        return count;
    }
}
