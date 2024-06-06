import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
//        n개의 바구니 m번 공을 넣는다
//        이미 공이 넣어진 상태라면 공을 빼고 새로운  공을 넣는다
//        i와 j를 입력한다. 이는 i번부터 j번까지의 바구니에 공을 넣겠다라는 의미
//        k는 넣을 공의 번호이다
        int arr[] = new int [N];
        for(int i=0; i<M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int k = sc.nextInt();
            for(int j=I; j<=J; j++){ // i번부터 j반까지 바구니에 공을 넣는다
                arr[j-1] = k;
            }
        }
        for(int i =0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}