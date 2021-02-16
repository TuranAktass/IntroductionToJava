import java.util.Scanner;

public class deneme{
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 511: ");
    int n = input.nextInt();

    displayCoins(n);
  }

  public static void displayCoins(int n) {
    String bin = decToBin(n);

    for (int i = 0; i < bin.length(); i++) {
      if (i % 3 == 0) { System.out.println(); }
      if (bin.charAt(i) == '0') {
        System.out.print("H ");
      } else {
        System.out.print("T ");
      }
    }
    System.out.println();
  }

  public static String decToBin(int dec) {
    StringBuilder bin = new StringBuilder();
    if (dec == 0) {
      bin.append("0");
    } else {
      while (dec != 0) {
        bin.insert(0, dec % 2);
        dec /= 2;
      }
    }
    return padToNinePlaces(bin.toString());
  }

  public static String padToNinePlaces(String bin) {
    if (bin.length() < 9) {
      for (int i = bin.length(); i < 9; i++) {
        bin = "0" + bin;
      }
    }
    return bin;
  }
}