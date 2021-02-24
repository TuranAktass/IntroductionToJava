public class Exercise11{
    public static void main(String args[]){
        /*
        The US censıs bureau projects population based on the following assumption
        -One birth every 7 seconds
        -One death every 13 seconds
        -One new immigrant every 45 seconds
        Write a program to display the population for each of the next five years. Assume the current population
        is 312,032,486 and one year has 365 days. 
        */
        System.out.println("Population : " + 5*( ((365*24*60*60) / 7.0) + ((365*24*60*60) / 45.0) - ((365*24*60*60) / 13.0)) + 312032486);
        System.out.println(5 * (((365 * 24 * 60 * 60) / 7.0) + ((365 * 24 * 60 * 60) / 45.0)
							- ((365 * 24 * 60 * 60) / 13.0)) + 312_032_486);
    }
}