public class Exercise07_16 {

	public static final int AR_LENGTH = 100_000;

	public static void main(String args[]) {
		int[] array = new int[AR_LENGTH];

		for (int i = 0; i < AR_LENGTH; i++) {
			array[i] = (int) (Math.random() * 100_000);
		}
		
		selectionSort(array);
		
		int key = (int) (Math.random() * 100_000);
		
		long startTime = System.currentTimeMillis();
		int result = linearSearch(array, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		System.out.println("Linear Search : " +executionTime + "ms");
		
		startTime = System.currentTimeMillis();
		result = binarySearch(array, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		
		System.out.println("Binary Search : "+executionTime + "ms");
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] == key)
				return i;
		}

		return -1;
	}

	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;

		while (high >= low) {
			int mid = (high + low) / 2;

			if (key < array[mid]) {
				high = mid - 1;
			} else if (key == array[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}

		}
		return -low-1;
	}
	
	public static void selectionSort(int [] array) {
		for(int i = 0; i < array.length; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j <array.length; j++) {
				if(currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;	
			}
		}
	}

}
