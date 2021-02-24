import java.util.Scanner;
public class Exercise06_07 {
    
    public static double futureInvestmentValue(
        double investmentAmount, double inRate, int years){
            double accValue;
            accValue = investmentAmount * Math.pow((1 + inRate / 1200), 12 * years);
            return accValue;
        }

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            
            System.out.print("The amount invested : ");
            double investmentAmount = input.nextDouble();
            System.out.print("Annual interest rate : ");
            double iRate = input.nextDouble();

            System.out.println("Years" + "          " + "Future Value");
            
            for(int years = 1; years <= 30; years++){
                System.out.println(years + "    " + 
                    futureInvestmentValue(investmentAmount, iRate, years));
            }

            input.close();
    }
    
}
