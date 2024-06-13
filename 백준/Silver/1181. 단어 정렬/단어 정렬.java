import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
//        set은 add하면서 중복이 있는 요소들은 알아서 제거하고 넣어준다.
//        set의 특성을 통해 중복을 제거하면서 데이터를 넣어준다.
        Set<String> mySet = new HashSet<>();
        for(int i=0; i<n; i++){
            mySet.add(br.readLine());
        }
//        그리고 set을 배열에 넣는 방법은 아래와 같다. 이렇게 중복이 제거된 요소들을 배열에 넣는다.
//        Set.toArray(new String[0]);
        String result[] = mySet.toArray(new String[0]);

//        lamda식을 이용해서 문자열의 길이를 비교하여 길이 순으로 정렬이 가능화다
//        문자열의 길이를 기반으로 문자열을 정리한 이후 같은 길이의 문자열은 사전순으로 재정렬이 필요
//        순서 정렬하기(11650)문제와 같이 오버라이딩을 통해 해결할 수 있다.
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                    만약 문자열의 길이가 같다면?
                if (o1.length() == o2.length()) {
//                    사전순으로 정렬 compareTo
                    return o1.compareTo(o2);
//                    민약 문자열의 길이가 같지 않다면?
                } else {
//                    문자열의 길이순으로 문자를 정렬
                    return o1.length() - o2.length();
                }
            }
        });
//        (String a, String b) -> a.length() - b.length() || a.compareTo(b))
//        + 중복된 단어는 하나만 출력해야 한다는 조건이 존재.
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}