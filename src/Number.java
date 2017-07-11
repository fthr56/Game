import java.util.Random;
import java.util.Scanner;

public class Number {
	
	public static void main(String[] args){
		
		int num, dap, count = 1;
		Random rnd = new Random();
		dap = rnd.nextInt(100);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다.");
		System.out.println("숫자를 입력해 주세요.(1~100)");

		while(true){
			num = scanner.nextInt();
			
			if(dap == num){
				System.out.printf("%d번만에 맞췄습니다!\n", count);
				break;
			}
			else if(dap > num){
				System.out.printf("%d보다 커요.\n",num);
			}
			else{
				System.out.printf("%d보다 작아요.\n",num);
			}
			count++;
		}
		System.out.println("플레이해 주셔서 감사합니다.");
		scanner.close();
	}
	
}
