import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = sc.nextLong();
        

        for(long x=-999; x<=999; x++){
            for(long y=-999; y<=999; y++){
                if((a*x)+(b*y) == c && (d*x)+(e*y) == f){
                    System.out.println(x +" " + y);
                }
            }
        }



    }
}
