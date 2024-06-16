import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long x = sc.nextLong();      // 게임 수
    static long y = sc.nextLong();      // 이긴 게임 수
    static int z = (int) (y * 100 / x); // 승률

    public static void main(String[] args) {
//        99이상은 오르지 않기 때문에 -1을 반환
        if (z >= 99) {
            System.out.println(-1);
//        그렇지 않은 경우 호출
        } else {
            binarySearch();
        }
    }

    public static void binarySearch() {
//        이분탐색 범위 설정 left & right
        int left = 0;
        int right = Integer.MAX_VALUE;
        int result = -1;
//        일반적인 binarySearch의 구조를 갖는다
        while (left <= right) {
            int mid = (left + right) / 2;
//            원래 z의 값에다가 +mid. 그 값이 z보다 큰 경우와 작은 경우(즉, 새로운 승률이 현재 승률보다 크다면?)
            if ((int) ((y + mid) * 100 / (x + mid)) > z) {
//                result에 새로운 값을 저장
                result = mid;
//                -1을 한 범위에서 새로운 탐색 시작
                right = mid - 1;
            } else {
//                +1을 한 범위에서 새로운 탐색을 시작
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}