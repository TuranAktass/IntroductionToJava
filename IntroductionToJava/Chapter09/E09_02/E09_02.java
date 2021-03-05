public class E09_02 {

	public static void main(String args[]) {
		Stock newStock = new Stock("ORCL", "Oracle Corporation");

		newStock.previousClosingPrice = 34.5;
		newStock.currentPrice = 34.35;

		System.out.println("change :  " + newStock.getChangePercent());
	}

}
