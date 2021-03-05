public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (getValue() % 2 == 0);
	}

	public boolean isOdd() {
		return (getValue() % 2 == 1);
	}

	public boolean isPrime() {
		int val = getValue();

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

	public boolean equals(int val) {
		if (val == getValue())
			return true;

		return false;
	}

	public boolean equals(MyInteger integer) {
		if (integer.getValue() == getValue())
			return true;

		return false;
	}

	public static int parseInt(char[] array) {
		return parseInt(new String(array));
	}

	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
	public void getStatus() {
		System.out.println("isPrime : " + isPrime());
		System.out.println("isOdd : " + isOdd());
		System.out.println("isEven : " + isEven());
	}
}
