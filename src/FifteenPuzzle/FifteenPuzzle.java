package FifteenPuzzle;

import java.lang.String;
import java.util.Scanner;

public class FifteenPuzzle {
	public static void main(String[] args) {

		int holeNumber;
		String command;
		Scanner scanner = new Scanner(System.in);

		System.out.println("15 퍼즐 입니다.");
		PuzzleArr puzzle = new PuzzleArr();
		holeNumber = puzzle.settingPuzzle();
		puzzle.printPuzzle();

		while (!puzzle.checkSolution()) {
			command = scanner.next();
			holeNumber = Move.moving(puzzle.puzzle, holeNumber, command);
			puzzle.printPuzzle();
		}
		scanner.close();
	}

}
