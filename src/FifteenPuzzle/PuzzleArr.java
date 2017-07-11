package FifteenPuzzle;

import java.util.Random;

public class PuzzleArr {

	public String[][] board = { { "1", "2", "3", "4" }, { "5", "6", "7", "8" }, { "9", "10", "11", "12" },
			{ "13", "14", "15", "" } };

	public int settingPuzzle() {
		Random rnd = new Random();

		//랜덤값을 이용해 for문의 동작 횟수를 정하며
		//for문 내부에서 위,아래,좌,우 어떻게 이동할지 또 한번의 랜덤값으로 선정하여 이동시킨다.
		int index = 16;
		int RandomNumber = rnd.nextInt(10) * 50 + 1;
		// for (int i = 0; i < RandomNumber; i++) 			//진짜 랜덤으로 할려면 풀자
		for (int i = 0; i < 5; i++) {						//현재는 5번만 이동 시켜 쉽게 풀게 해둠
			switch ((rnd.nextInt(4)) % 4) {
			case 0:
				index = Move.moving(board, index, "w");
				break;
			case 1:
				index = Move.moving(board, index, "a");
				break;
			case 2:
				index = Move.moving(board, index, "s");
				break;
			case 3:
				index = Move.moving(board, index, "d");
				break;
			}
			// printPuzzle(); //섞이는 위치 볼려면 이걸 이용해서 추적
		}
		return index;
	}

	public void printPuzzle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2s ", board[i][j]);
			}
			System.out.println();
		}
	}
	//1부터 15까지 순서대로 나열되어 있으면 number가 차근차근 증가하며 16까지된다
	//그러면 1부터 15까지 제대로 배치되었다고 판단한다. 만약 16이 되기전에 다른값이 있으면 flase를 리턴
	public boolean checkSolution() {
		int number = 0;
		for (int i = 0; i < 4; i++) {								
			for (int j = 0; j < 4; j++){ 							
				if (++number == 16) {								
					return true;									
				}
				if (!(board[i][j].equals(String.valueOf(number)))) {
					return false;
				}
			}
		}
		return false;
	}
}
