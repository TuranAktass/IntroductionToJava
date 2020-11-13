public class Exercise04_03 {
    public static void main(String args[]) {
        final double RADIUS = 6371.01;

        
        // city1 -> Atlanta
        double lat1 = 33.7489954;
        double long1 = -84.3879824;
        // city2 -> Orlando
        double lat2 = 28.5383355;
        double long2 = -81.3792364999;
        // city3 -> Savannah
        double lat3 = 32.0835407;
        double long3 = -81.09983419999998;
        // city4 -> Charlotte
        double lat4 = 35.2270869;
        double long4 = -80.84312669999997;

        //distance between atlanta and savannah
        double distance1 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat1))*Math.sin(Math.toRadians(lat3))+
        Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat3))*Math.cos(Math.toRadians(long1 - long3)));
        //distance between savannah and charlotte
        double distance2 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat3))*Math.sin(Math.toRadians(lat4))+
        Math.cos(Math.toRadians(lat3))*Math.cos(Math.toRadians(lat4))*Math.cos(Math.toRadians(long3-long4)));
        //distance between charlotte and atlanta
        double distance3 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat4))*Math.sin(Math.toRadians(lat1))+
        Math.cos(Math.toRadians(lat4))*Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(long4 - long1)));
        //distance between atlanta and orlando
        double distance4 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat1))*Math.sin(Math.toRadians(lat2))+
        Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(long1-long2)));
        //distance between orlando and savannah
        double distance5 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat2))*Math.sin(Math.toRadians(lat3))+
        Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(lat3))*Math.cos(Math.toRadians(long2-long3)));
        //disntace between savannah and atlanta
        double distance6 = RADIUS * Math.acos(Math.sin(Math.toRadians(lat3))*Math.sin(Math.toRadians(lat1))+
        Math.cos(Math.toRadians(lat3))*Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(long3-long1)));

        double s1 = (distance1 + distance2 + distance3)/2.0;
        double s2 = (distance4 + distance5 + distance6)/2.0;

        double area1 = Math.sqrt(s1*(s1-distance1)*(s1-distance2)*(s1-distance3));
        double area2 = Math.sqrt(s2*(s2- distance4)*(s2-distance5)*(s2-distance6));
        System.out.println("area1 : " + area1);
        System.out.println("area2 : " + area2);
        double area = area1 + area2;
        System.out.println("The area :" + area);

    }
}
