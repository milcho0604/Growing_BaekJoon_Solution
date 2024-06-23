import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int count = 0;
    static int n;
    static int m;
    static int result = -1;


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
//        int p = arr.length/2;
//        int r = arr.length/2 + 1;
        merge_sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }


    public static void merge_sort(int[] arr, int p, int r) {
        if(count>m) {
            return ;
        }
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int arr[], int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[r - p + 1];

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }
        i=p;
        t=0;
        while(i<=r){
            count++;
            if(count ==m){
                result = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}