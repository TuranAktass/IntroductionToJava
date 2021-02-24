import java.util.Scanner;
import java.util.Arrays;

public class Exercise08_20 {
	public static int turn = 1;
	public static String winner = "";

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[][] board = newBoard();
		int turn = 1;

		displayBoard(board);

		do {
			dropDisk(board, input);
		} while (win(board));
	}

	public static int[][] newBoard() {
		int[][] board = new int[6][7];

		for (int i = 0; i < board.length; i++) {
			Arrays.fill(board[0], 0);
		}

		return board;
	}

	public static void displayBoard(int[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 0) {
					System.out.print("| ");
				} else if (board[i][j] == 1) {
					System.out.print("|R");
				} else if (board[i][j] == -1) {
					System.out.print("|Y");
				}
			}
			System.out.print("|\n");
		}

		System.out.println("_______________");
	}

	public static void dropDisk(int[][] board, Scanner input) {
		int disk = 0;
		if (turn == 1) {
			System.out.print("Drop a red disk at column (0-6) : ");
			disk = input.nextInt();
		}

		else if (turn == -1) {
			System.out.print("Drop a yellow disk at column (0-6) : ");
			disk = input.nextInt();
		}

		for (int i = board.length - 1; i > -1; i--) {
			if (board[i][disk] != 0) {
				continue;
			} else {
				if (turn == 1) {
					board[i][disk] = 1;
					turn = -1;
					break;
				}

				else if (turn == -1) {
					board[i][disk] = -1;
					turn = 1;
					break;
				}
			}
		}
		displayBoard(board);
	}

	public static boolean win(int[][] board) {
		// check row
		for (int i = 0; i < board.length; i++) {
			int counter = (turn == 1) ? 1 : -1;

			for (int j = 0; j < board[0].length - 1; j++) {

				if (board[i][j] == board[i][j + 1]) {
					counter = (turn == 1) ? counter + 1 : counter - 1;

					if (counter == 4) {
						winner = "Red";
						return true;
					} else if (counter == -4) {
						winner = "Yellow";
						return true;
					}
				}

				else {
					counter = 0;
				}
			}
			System.out.println(counter);
		}

		return false;
	}

}