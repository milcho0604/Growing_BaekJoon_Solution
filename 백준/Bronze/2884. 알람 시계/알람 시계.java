import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();// 시간
		int m = sc.nextInt();// 분
		// 45분 이하인 경우
		if(m<45) {
			h--;
			m=60-(45-m);
			if(h<0) {
				h=23;
			}
			System.out.println(h+" "+m);
		}
        // 45분 이상인 경우
		else {
			m=m-45;
			System.out.println(h+" "+m);
		}
		

	}

}
