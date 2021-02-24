import java.util.Scanner;
public class Exercise05_08 {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String studentName = "     ";
		int score = 0;
		
		System.out.print("Enter number of students :");
		int numberOfStudents = input.nextInt();
		
		for(int i = 1; i <= numberOfStudents; i++) {
			System.out.print("Student's name : ");
			String tempName = input.next();
			System.out.print("Student's score : ");
			int tempScore = input.nextInt();
			
			if(tempScore > score) {
				studentName = tempName;
				score = tempScore;
			}
		}
		
		System.out.println("Highest Score : " + studentName + " --- " + score);
		
		input.close();
	}

}
