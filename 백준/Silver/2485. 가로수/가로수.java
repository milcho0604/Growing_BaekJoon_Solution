import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
//        각 가로수의 거리를 쉽게 계산하기 위해서 배열을 뒤집는다
        reverseArray(arr);

//        리스트를 선언하여 리스트에 가로수간의 길이차이를 담는다
        List<Integer> minus = new ArrayList<>();
        for(int i= 0; i<arr.length-1; i++){
            minus.add(arr[i] - arr[i + 1]);
        }

//        리스트에는 가로수들 끼리의 길이가 담겨있다. 이 길이의 최대공약수를 구한다.
        int temp = minus.get(0);
        for(int i=1; i<minus.size(); i++){
            temp = calculate(temp, minus.get(i));
        }

//        최대공약수를 구하고 추가로 필요한 가로수를 구한다.
        int colonnadeCount = 0;
        for(int i=0; i<minus.size(); i++){
            colonnadeCount += minus.get(i)/temp -1 ; // 첫 번째 구간에는 이미 가로수가 있기 때문에 -1을 해주어야 한다.
        }
        System.out.println(colonnadeCount);

    }

//    배열을 뒤집는 메서드
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

//    최대공약수를 구하는 메서드
    public static int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
