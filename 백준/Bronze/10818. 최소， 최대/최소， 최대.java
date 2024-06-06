
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int [] score = new int[num];
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		System.out.print(score[0] +" " + score[num-1]);
		

	}

}
