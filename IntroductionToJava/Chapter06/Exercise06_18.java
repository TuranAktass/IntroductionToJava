import java.util.Scanner;

public class Exercise06_18 {

    public static String checkPassword(String password) {

        int digitCounter = 0; //at least two digits
        boolean check = false; //only letters and digits
        boolean length = password.length() == 8 ? true : false;

        for (int i = 0; i < password.length(); i++) {

            if ((password.charAt(i) > 47 && password.charAt(i) < 58) //digits
                    || (password.charAt(i) > 64 && password.charAt(i) < 91) // A - Z
                    || (password.charAt(i) > 96 && password.charAt(i) < 123)){ // a - z
                    
                check = true;;
            }

        }

        for (int i = 0; i < password.length(); i++) {

            if ((password.charAt(i) > 47 && password.charAt(i) < 58)) {
                digitCounter++;
            }

        }

        if (check == true && digitCounter >= 2 && length == true)
            return "Valid Password!";
        else
            return "Invalid Password!";

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password = input.nextLine();

        System.out.println(checkPassword(password));

        input.close();
    }

}
