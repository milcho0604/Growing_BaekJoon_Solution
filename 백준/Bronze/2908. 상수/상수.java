import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer k = new StringBuffer(a);
		StringBuffer h = new StringBuffer(b);
		a = k.reverse().toString();
		b = h.reverse().toString();
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}



