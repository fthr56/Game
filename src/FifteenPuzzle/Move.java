package FifteenPuzzle;

public class Move {
	public static int moving(String[][] puzzle, int index, String key) {
		String temp;
		int i = (index - 1) / 4;
		int j = (index - 1) % 4;

		temp = puzzle[i][j];

		switch (key) {

		// 위쪽으로 이동
		case "w":
			if (i == 3) {
				System.out.println("그렇겐 이동 할 수 없습니다.");
				break;
			}
			puzzle[i][j] = puzzle[i + 1][j];
			puzzle[i + 1][j] = temp;
			return index + 4;

		// 왼쪽으로 이동
		case "a":
			if (j == 3) {
				System.out.println("그렇겐 이동 할 수 없습니다.");
				break;
			}
			puzzle[i][j] = puzzle[i][j + 1];
			puzzle[i][j + 1] = temp;
			return index + 1;

		// 아래쪽으로 이동
		case "s":
			if (i == 0) {
				System.out.println("그렇겐 이동 할 수 없습니다.");
				break;
			}
			puzzle[i][j] = puzzle[i - 1][j];
			puzzle[i - 1][j] = temp;
			return index - 4;

		// 오른쪽으로 이동
		case "d":
			if (j == 0) {
				System.out.println("그렇겐 이동 할 수 없습니다.");
				break;
			}
			puzzle[i][j] = puzzle[i][j - 1];
			puzzle[i][j - 1] = temp;
			return index - 1;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}
		return index;
	}

}
