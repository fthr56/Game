package Lotto;

import java.util.Arrays;
import java.util.Scanner;

public class PlayLotto {
	public static void main(String[] args) {

		int[] winningNumber = new int[6];					//당첨 번호를 담을 배열
		int[] equalWinning = { 0, 0, 0, 0, 0, 0, 0 };		//당천번호랑 구매한 로또의 숫자 몇개가 겹쳤는지 확인하는 배열
		int money, volume, getMoney;									//구입금액과 로또 구매량 및 얻은 금액
		Scanner scanner = new Scanner(System.in);

		// 구입 금액 입력 및 구매한 로또 갯수 계산
		System.out.println("구입 금액을 입력해 주세요.");
		money = scanner.nextInt();
		volume = money / 1000;
		System.out.printf("%d개를 구매했습니다.\n", volume);

		// 구매한 만큼의 로또 제공
		Lotto[] arrLotto = new Lotto[volume];
		for (int i = 0; i < volume; i++) {
			arrLotto[i] = new Lotto();
		}

		// 당첨 번호 입력
		setWinning(winningNumber);

		for (int i = 0; i < winningNumber.length; i++) {
			System.out.printf("%2d ", winningNumber[i]);
		}
		System.out.println();

		//당첨번호와 구매한 로또의 당첨 여부 확인
		for (int i = 0; i < volume; i++) {
			int index;
			index = checkWinningAndLotto(arrLotto[i], winningNumber);
			equalWinning[index] = equalWinning[index] + 1;
		}
		
		System.out.printf("3개 일치 (5,000원) %d개\n", equalWinning[3]);
		System.out.printf("4개 일치 (50,000원) %d개\n", equalWinning[4]);
		System.out.printf("5개 일치 (1,500,000원) %d개\n", equalWinning[5]);
		System.out.printf("6개 일치 (2,000,000,000원) %d개\n", equalWinning[6]);

//		double percent = (double)((equalWinning[3] * 5000) +(equalWinning[4] * 50000)+
//				(equalWinning[5] * 1500000)+(equalWinning[6] * 2000000000))/money;
//		System.out.printf("총 수익률은 %d퍼센트 입니다.", percent);
		scanner.close();
	}

	public static void setWinning(int[] winningNumber) {

		System.out.println("지난 주 당첨 번호를 입력해 주세요.");

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < winningNumber.length; i++) {
			System.out.printf("%d번째: ", i + 1);
			winningNumber[i] = scanner.nextInt();
		}
		Arrays.sort(winningNumber);
		scanner.close();
	}

	public static int checkWinningAndLotto(Lotto myLotto, int[] winningNumber) {

		int count = 0;
		for (int i = 0; i < myLotto.data.length; i++) {
			for (int j = 0; j < winningNumber.length; j++) {
				if (myLotto.data[i] == winningNumber[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
