import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a + b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + res);
        }
    }
}