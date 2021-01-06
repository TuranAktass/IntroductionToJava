class Exercise06_32 {

    public static void main(String args[]) {
        int counter = 0;

        for (int i = 0; i < 10_000; i++) {
            counter += game();
        }

        System.out.printf("%d wins in 10.000 games." , counter);
    }

    public static int rollDice() {
        return ((int) (Math.random() * 6) + 1);
    }

    public static int sumOfDices() {
        int d1 = rollDice();
        int d2 = rollDice();
        int sum = d1 + d2;

        return sum;
    }

    public static int firstRound(int sum) {
        if (sum == 2 || sum == 3 || sum == 12)
            return -1;

        else if (sum == 7 || sum == 11)
            return 1;

        else
            return 0;
    }

    public static int secondRound(int sum, int point) {
        if (sum == 7)
            return -1;

        else if (sum == point)
            return 1;

        else
            return 0;
    }

    public static int game() {
        int sum = sumOfDices();
        int win = 0;

        int firstRoundResult = firstRound(sum);

        if (firstRoundResult == 1)
            win++;

        else {
            int score = sum;
            int secondRoundResult = secondRound(sum, score);

            do {
                sum = sumOfDices();
                secondRoundResult = secondRound(sum, score);

            } while (secondRoundResult == 0);

            if (secondRoundResult == 1)
                win++;

        }

        return win;
    }

}