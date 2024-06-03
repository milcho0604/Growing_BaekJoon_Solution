
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt(); // 총 금액
		int count = sc.nextInt(); // 물건의 개수
		
		for(int i=0; i<count; i++) {
			int price = sc.nextInt(); // 각각의 물건 가격
			int pro = sc.nextInt(); // 각각의 물건 
			total = total-(price*pro); // 총 금액을 확인해보기
		}
		if(total == 0) {
			System.out.println("Yes"); // 총 금액이 일치한다면 Yes 출력
		}
		else {
			System.out.println("No"); // 아니라면 NO
		}
	}

}
