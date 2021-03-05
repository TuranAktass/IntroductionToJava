public class E10_06 {

	public static void main(String args[]) {
		StackOfIntegers stack = new StackOfIntegers();
		int n = 120;

		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		int size = stack.getSize();

		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
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
