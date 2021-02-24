import java.util.Scanner;

public class Exercise08_37 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int correctCounter = 0;
		String[][] capitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" },
				{ "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
				{ "Maryland", "Annapolis" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
				{ "Minnesota", "St. Paul" }, { "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
				{ "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
				{ "New Hampshire", "Concord" }, { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
				{ "New York", "Albany" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
				{ "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" } };

		for (int i = 0; i < capitals.length; i++) {
			System.out.println("What is the capital of " + capitals[i][0]);
			String answer = input.nextLine();
			answer = answer.toUpperCase();

			if (answer.equals(capitals[i][1].toUpperCase())) {
				correctCounter++;
				System.out.println("Your answer is correct!");
			} else {
				System.out.println("The correct answer should be " + capitals[i][1]);
			}
		}

		System.out.println("The correct count is " + correctCounter);

		input.close();
	}

}
