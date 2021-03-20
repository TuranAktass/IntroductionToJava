import java.util.Scanner;

public class E10_05 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer : ");
		int number = input.nextInt();

		StackOfIntegers stack = primeFactors(number);

		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
		
		input.close();
	}

	public static StackOfIntegers primeFactors(int number) {
		StackOfIntegers stack = new StackOfIntegers();

		while (number % 2 == 0) {
			stack.push(2);
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				stack.push(i);
				number /= i;
			}
		}

		if (number > 2) {
			stack.push(number);
		}

		return stack;
	}

	public static boolean isPrime(int val) {

		if (val == 0 || val == 1 || val % 2 == 0) {
			return false;
		}
		if (val == 2) {
			return true;
		}
		for (int i = 3; i < val; i++) {
			if (val % i == 0) {
				return false;
			}
		}

		return true;
	}
}
