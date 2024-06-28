//import java.io.*;
//import java.util.*;
//
//public class Main {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        Deque<Integer> myQue = new ArrayDeque<>();
//
//
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        myQue.push(arr[0]);
////        for (int i = 0; i < n; i++) {
////            int temp = myQue.peek();
////            if (temp < arr[i]) {
////                myQue.poll();
////                myQue.addLast(arr[i]);
////                System.out.println(myQue);
////            }
////        }
//        while (!myQue.isEmpty()){
//            for (int i = 0; i < n; i++) {
//                int temp = myQue.peek();
//                if (temp < arr[i]) {
//                    myQue.poll();
//                    myQue.addLast(arr[i]);
////                    System.out.println(myQue);
//                    sb.append(myQue.peek()).append(" ");
//                }
//
//            }
//            break;
//        }
//        System.out.println(sb);
//    }
//}



import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Deque<Integer> myQue = new ArrayDeque<>();
        int[] answer = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        myQue는 첫 while문을 통과하고 i값인 0이 들어감
//        2번째 반복에서 arr[myQue.peek()] = arr[0]
//        arr[i] = arr[1]
//        arr[0]과 arr[1] (3과 5)을 비교하는 것과 같음. 그리고 while문 조건이 만족하면 answer배열 myQue의 자리 
//        answer[0] = arr[1]이므로 answer[0] = 5가 삽입
        for (int i = 0; i < n; i++) {
            while (!myQue.isEmpty() && arr[myQue.peek()]<arr[i]){
//                pop을 통해 myQue에서 인덱스를 지운다
                answer[myQue.pop()] = arr[i];
            }
//            이 반복문을 통해 myQue에는 0~4까지의 인덱스 번호가 담긴다.
            myQue.push(i);
        }

//        위 과정을 통해 myQue는 pop하여 myQue가 비워지는데, 만약 비워지지 않았다면 = 오큰수가 겂다면(오큰수가 없어야 삭제되지 않음)
//        그 인덱스 위치에 -1을 삽입한다.
        while(!myQue.isEmpty()){
            answer[myQue.pop()]=-1;
        }
        for(int a : answer){
            sb.append(a).append(" ");
        }


//        System.out.println(Arrays.toString(answer));

        System.out.println(sb);
    }
}