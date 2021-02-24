public class Exercise06_09 {
    
    public static double footToMeter(double foot){
        double meter = 0.0;
        meter = 0.305 * foot;
        return meter;
    }
    
    public static double meterToFoot(double meter){
        double foot = 0.0;
        foot = 3.279 * meter;
        return foot;
    }

    public static void main(String args[]){
        int meter = 20;

        System.out.println("Feet            " + "Meter          " + "Meter          " + "Feet");

        for(int feet = 1; feet <= 10; feet++){
            System.out.printf("%d.0\t\t%.1f\t\t%d.0\t\t%.1f\n" , feet , footToMeter(feet), meter, meterToFoot(meter));
            meter += 5;
        }
        
    }
}
