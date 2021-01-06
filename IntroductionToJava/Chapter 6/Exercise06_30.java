public class Exercise06_30 {

    public static int rollDice() {
        return ((int) (Math.random() * 6) + 1);
    }

    public static int sumOfDices(){
        int d1 = rollDice(); int d2 = rollDice();
        int sum = d1 + d2;

        System.out.printf("You rolled %d + %d = %d\n" , d1 , d2 , sum);

        return sum;
    }

    public static void displayResult(int player){
        String result = "You ";

        if(player == 1)
            result += "Win";
        else if(player == -1)
            result += "Lose";

        System.out.println(result);
    }

    public static int firstRound(int sum){
        if(sum == 2 ||sum == 3 || sum == 12)
            return -1;

        else if(sum == 7 || sum == 11)
            return 1;

        else
            return 0;
    }

    public static int secondRound(int sum, int point){
        if(sum == 7)
            return -1;
        
        else if(sum == point)
            return 1;

        else 
            return 0;
    }

    public static void game(){
        int sum = sumOfDices();

        int firstRoundResult = firstRound(sum);
        if(firstRoundResult == 1)
            displayResult(firstRoundResult);
        
        else if(firstRoundResult == -1)
            displayResult(firstRoundResult);

        else{
            int score = sum;
            int secondRoundResult = secondRound(sum,score);

            do{
                sum = sumOfDices();
                secondRoundResult = secondRound(sum, score);
            }while(secondRoundResult == 0);

            displayResult(secondRoundResult);
        }

    }

    public static void main(String args[]){
        game();
    }

}
