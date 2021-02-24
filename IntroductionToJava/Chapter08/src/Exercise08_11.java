import java.util.Scanner;
public class Exercise08_11 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 511 : ");
		int number = input.nextInt();
		
		int [] bin = toBinary(number);
		
		char[][] coinMatrix = coins(bin);
		displayMatrix(coinMatrix);
		
		input.close();
	}
	
	public static int [] toBinary(int decimal){    
	     int binary[] = new int[9];    
	     int index = 8; 
	     
	     while(decimal > 0){    
	       binary[index--] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     
	     return binary;
	} 
	public static char [][] coins(int [] bin){
		char [][] chArr = new char[3][3];
		int index = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[0].length; j++) {
				chArr[i][j] =(bin[index] == 0) ? 'H' : 'T';
				index++;
			}
		}
		
		return chArr;
	}
	
	
	public static void displayMatrix(char [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
