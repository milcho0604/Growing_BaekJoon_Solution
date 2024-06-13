import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0; i<n; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int result =a+b;
            System.out.println("Case #"+(i+1)+": "+result);
        }
        sc.close();
    }
}


//5
//        1 1 =2
//        2 3 =5
//        3 4 =7
//        9 8 =17
//        5 2 =7