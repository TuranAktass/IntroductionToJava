import java.util.Arrays;
import java.util.Scanner;
public class Exercise08_09 {
 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		char [][] currentBoard = new char [3][3];
		for(int i = 0; i < currentBoard.length; i++) {
			Arrays.fill(currentBoard[i], ' ');
		}
		
		char winner = ' ';
		
		do {
			System.out.print("Enter a row (0 , 1 or 2) for player X : ");
			int xRow = input.nextInt();
			System.out.print("Enter a column (0 , 1 or 2) for player X : ");
			int xCol = input.nextInt();
			
			currentBoard[xRow][xCol] = 'X';
			displayBoard(currentBoard);
			winner = checkWin(currentBoard);
			
			if(winner == 'X') {
				System.out.println("X Player won");
				break;
			}
			
			System.out.print("Enter a row (0 , 1 or 2) for player O : ");
			int oRow = input.nextInt();
			System.out.print("Enter a column (0 , 1 or 2) for player O : ");
			int oCol = input.nextInt();
			
			currentBoard[oRow][oCol] = 'O';
			displayBoard(currentBoard);
			winner = checkWin(currentBoard);
			
			if(winner == '0') {
				System.out.println("O Player  won");
				break;
			}
			
			
		}while(true);
		
		input.close();
	}
	
	public static void displayBoard(char [][] currentBoard) {
		
		for(int i = 0; i < 3; i++) {
				System.out.println("——————-——————");
				System.out.println("| "+ currentBoard[i][0] + " | " + currentBoard[i][1] + " | " + currentBoard[i][2] + " |");
		}
		System.out.println("——————-——————");
	}
	
	public static char checkWin(char [][] board) {
		
		if(		// horizontal
				(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')||
				(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')||
				(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')||
				//vertical
				(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')||
				(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')||
				(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')||
				
				(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')||
				(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
			return 'X';
	else if(	
				(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')||
				(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')||
				(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')||
				//vertical
				(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')||
				(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')||
				(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')||
				
				(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')||
				(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))
		return 'O';
		
	else
		return ' ';
		
	
	}
}
