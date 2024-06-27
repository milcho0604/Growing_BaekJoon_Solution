import java.util.Scanner;
public class Main{
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;

		count = n * m - 1;
		System.out.println(count);

	}
}