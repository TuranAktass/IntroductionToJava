public class Exercise07_23 {
	
	public static void main(String args[]) {
		boolean [] locker = new boolean[101];
		lockUnlock(locker);
		display(locker);
	}
	
	public static void lockUnlock(boolean [] locker) {
		for(int i = 1; i < locker.length; i++) {
			for(int j = i; j < locker.length; j += i) {
				locker[j] = !locker[j];
			}
		}
	}
	
	public static void display(boolean [] locker) {
		
		for(int i = 1; i < locker.length; i++) {
			if(locker[i]) System.out.println(i + " : open");
		}
	}
}
