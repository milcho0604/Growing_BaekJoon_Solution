import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        HashSet<Integer> uni = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]%42;
            uni.add(arr[i]);
        }
        System.out.println(uni.size());
    }
}