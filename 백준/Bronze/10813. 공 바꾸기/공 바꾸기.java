import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int [N];
//        n개의 바구니
//        공을 바꿀 횟수 m
//        공을 바뚤 바구니 2개 선택하고 서로 교환
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        for(int i=0; i<M; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for(int i =0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}