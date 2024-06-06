import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[31];

        for(int i=1; i<=28; i++){
            int s = sc.nextInt();
            arr[s] = 1;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] != 1){
                System.out.println(i);
            }
        }
    }
}