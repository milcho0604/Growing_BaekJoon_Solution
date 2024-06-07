import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();  // 문자열의 앞뒤 공백을 제거
        sc.close();  // 스캐너를 닫아줍니다

        if (st.isEmpty()) {
            System.out.println(0);  // 문자열이 비어있다면 단어 수는 0
        } else {
            int count = 1;  // 단어 수를 세는 변수. 공백 수보다 1 많습니다.

            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == ' ') {
                    count += 1;
                }
            }

            System.out.println(count);  // 최종 단어 수를 출력
        }
    }
}
