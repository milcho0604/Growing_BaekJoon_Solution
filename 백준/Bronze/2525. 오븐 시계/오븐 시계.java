import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();// 시간
		int m = sc.nextInt();// 분
		int p = sc.nextInt();// 소요 시간
		
		int min = h * 60 + m;
		min = min + p;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);

	}

}
