import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Set을 이용해서 배열에서 중복된 요소를 제거하고 정렬 -> 좌표 압축을 위해서는 꼭 정렬이 필요
        Set<Integer> mySet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }

        // Set을 List로 변환(본인이 리스트를 좋아하는 이유로)
        List<Integer> myList = new ArrayList<>(mySet);

        // 좌표 압축을 시행
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
//            바로 직전에 풀었던 binarySearch문제를 활용하여 풀어보았다.
//            중복이 제거된 myList에 arr[i]값을 찾는다.
            int result = Collections.binarySearch(myList, arr[i]);
//            찾은 위치를 반환한다. 내가 몇번째로 작은 수냐?라는 것이기 때문에 나의 위치를 반환해도 괜찮다.
            sb.append(result).append(' ');
        }
//        공백을 제거하기 위해 trim을 사용
        System.out.println(sb.toString().trim());
    }
}
