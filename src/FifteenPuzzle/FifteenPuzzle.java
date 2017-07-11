package FifteenPuzzle;

import java.lang.String;
import java.util.Scanner;

public class FifteenPuzzle {
	public static void main(String[] args) {

		int holeNumber, count = 0;
		String command;
		Scanner scanner = new Scanner(System.in);

		System.out.println("15 퍼즐 입니다.");
		PuzzleArr puzzle = new PuzzleArr();
		holeNumber = puzzle.settingPuzzle();
		// holeNumber = puzzle.setRandom();
		puzzle.printPuzzle();

		while (!puzzle.checkSolution()) {
			count++;
			System.out.println("명령(w, a, s, d, q)");
			if ("q".equals(command = scanner.next())) {
				System.out.println("종료 합니다.");
				scanner.close();
				return;
			}
			holeNumber = Move.moving(puzzle.board, holeNumber, command);
			puzzle.printPuzzle();
		}
		System.out.printf("%d번만에 완성 하셨습니다.\nThank you for playing!!", count);
		scanner.close();
	}
}
