public class Exercise04_06 {
    public static void main(String args[]) {
        double radius = 40;

        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));

        double x1 = radius * (Math.cos(angle1));
        double y1 = radius * (Math.sin(angle1));
        double x2 = radius * (Math.sin(angle2));
        double y2 = radius * (Math.sin(angle2));
        double x3 = radius * (Math.sin(angle3));
        double y3 = radius * (Math.sin(angle3));

        double side1 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double angleX = Math
                .toDegrees(Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3)));
        double angleY = Math
                .toDegrees(Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3)));
        double angleZ = Math
                .toDegrees(Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2)));

        System.out.printf("The three angles are ; %.2f\n%.2f\n%.2f\n", angleX, angleY, angleZ);

    }
}
