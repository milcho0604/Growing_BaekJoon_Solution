import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

//        유클리드 호제법을 사용한다고 합니다
        int numerator = a*d + b*c;      // 유클리드 호제법으로 분자 구하기
        int denominator = b*d;          // 유클리드 호제법으로 분모 구하기
//        기약분수는 분자와 분모의 최대공약수를 구하고 최대공약수로 분자와 분모를 나누면 끝 
        int value = calculate(numerator, denominator);  // 최대공약수 구하기
        numerator = numerator/value;
        denominator = denominator/value;
        System.out.println(numerator + " " + denominator);
    }

    public static int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
