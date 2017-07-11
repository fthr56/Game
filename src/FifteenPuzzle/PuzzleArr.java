package FifteenPuzzle;

import java.util.Random;

public class PuzzleArr {

	public String[][] puzzle;

	public PuzzleArr() {
		puzzle = new String[4][4];
	}

	public int settingPuzzle() {
		int number = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (++number == 16) {
					puzzle[i][j] = "";
					break;
				}
				puzzle[i][j] = String.valueOf(number);
			}
		}
		return setRandom();
	}

	public int setRandom() {
		Random rnd = new Random();

		int index = 16;
		int RandomNumber = rnd.nextInt(10) * 50 + 1;
		// for (int i = 0; i < RandomNumber; i++)				//진짜 랜덤으로 할려면 풀자
		for (int i = 0; i < 5; i++) {
			switch ((rnd.nextInt(4)) % 4) {
			case 0:
				index = Move.moving(puzzle, index, "w");
				break;
			case 1:
				index = Move.moving(puzzle, index, "a");
				break;
			case 2:
				index = Move.moving(puzzle, index, "s");
				break;
			case 3:
				index = Move.moving(puzzle, index, "d");
				break;
			}
//			printPuzzle();										//섞이는 위치 볼려면 이걸 이용해서 추적
		}
		return index;
	}

	public void printPuzzle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%2s ", puzzle[i][j]);
			}
			System.out.println();
		}
	}

	public boolean checkSolution() {
		int number = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (++number == 16) {
					System.out.println("답입니다.");
					return true;
				}
				if (!(puzzle[i][j].equals(String.valueOf(number)))) {
					return false;
				}
			}
		}
		return false;
	}
}
