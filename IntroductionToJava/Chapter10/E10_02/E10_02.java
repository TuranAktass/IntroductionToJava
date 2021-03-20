public class E10_02 {

	public static void main(String args[]) {
		BMI bmi1 = new BMI("Kim Yang" , 18 , 145 , 70);
		System.out.println("The BMI for " + bmi1.getName() + " is "  + bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Susan King" ,215 , 70);
		System.out.println("The BMI for " + bmi2.getName() + " is "  + bmi2.getBMI() + " " + bmi2.getStatus());
		
		BMI bmi3 = new BMI("Roland Deschain" , 23 , 160, 6, 3);
		System.out.println("The BMI for " + bmi3.getName() + " is "  + bmi3.getBMI() + " " + bmi3.getStatus());
	}
}
