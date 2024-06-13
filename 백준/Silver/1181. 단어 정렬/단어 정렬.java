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
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
//        lamda식을 이용해서 문자열의 길이를 비교하여 길이 순으로 정렬이 가능화다
//        문자열의 길이를 기반으로 문자열을 정리한 이후 같은 길이의 문자열은 사전순으로 재정렬이 필요
//        순서 정렬하기(11650)문제와 같이 오버라이딩을 통해 해결할 수 있다.
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                    만약 문자열의 길이가 같다면?
//                if (o1.length() == o2.length()) {
////                    사전순으로 정렬 compareTo
//                    return o1.compareTo(o2);
////                    민약 문자열의 길이가 같지 않다면?
//                } else {
////                    문자열의 길이순으로 문자를 정렬
//                    return o1.length() - o2.length();
//                }
//            }
//        });
//        (String a, String b) -> a.length() - b.length() || a.compareTo(b))
//        + 중복된 단어는 하나만 출력해야 한다는 조건이 존재.
//        List<String> myList = new ArrayList<>();
//        for(int i=0; i< arr.length; i++){
//            myList.add(arr[i]);
//        }
//        for(int i=0; i< myList.size(); i++){
//            if(!myList.contains(myList.get(i).equals(myList.get(i+1)))){
//                System.out.println(myList.get(i));
//            }
//        }
        Set<String> mySet = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            mySet.add(arr[i]);
        }
        String result[] = mySet.toArray(new String[0]);

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
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}