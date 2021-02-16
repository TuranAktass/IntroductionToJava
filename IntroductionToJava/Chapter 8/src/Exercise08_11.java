
public class Exercise08_11 {
	
	public static void main(String args[]) {
		
		int [][] coins = new int[3][3];
		char [][] chCoins = new char[3][3];
		
		for(int i = 0; i < coins.length; i++) {
			for(int j = 0; j < coins[0].length; j++) {
				coins[i][j] = (int)(Math.random() * 2);
			}
		}
	}
	
	
}
