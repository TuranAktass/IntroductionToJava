import java.util.Scanner;

/*(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program:
*/
public class Exercise07_05 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[] nums = new int[10];
		int counter = 0;

		System.out.println("Enter ten numbers : ");

		for (int i = 0; i < 10; i++) {
			int num = input.nextInt();

			if (isDistinct(nums, num)) {
				nums[i] = num;
				counter++;
			}
		}

		System.out.println("Number of distinct numbers : " + counter);

		for (int i = 0; i < counter; i++) {
			System.out.print(nums[i] + " ");
		}

		input.close();
	}

	public static boolean isDistinct(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {
			if (num == array[i])
				return false;
		}

		return true;
	}
}
