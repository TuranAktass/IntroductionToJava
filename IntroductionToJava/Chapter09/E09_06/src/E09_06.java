public class E09_06 {

	public static void main(String args[]) {
		StopWatch newWatch = new StopWatch();
		int[] numbers = randomArray();

		newWatch.start();
		selectionSort(numbers);
		newWatch.stop();

		System.out.println("the execution time of sorting 100,000 numbers using selection sort : "
				+ newWatch.getElapsedTime() + "ms");
	}

	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static int[] randomArray() {
		int[] numbers = new int[100_000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100_000);
		}

		return numbers;
	}
}
