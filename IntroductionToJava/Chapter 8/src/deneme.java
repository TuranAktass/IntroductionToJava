
public class deneme{
  public static void main(String[] args) {
    double[][] points = {
      {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9},
      {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}
    };

    int p1 = 0, p2 = 1;
    double shortestDistance = distance(points[p1][0], points[p1][1],
      points[p1][2], points[p2][0], points[p2][1], points[p2][2]);

    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = distance(points[i][0], points[i][1], points[i][2],
          points[j][0], points[j][1], points[j][2]);

        if (shortestDistance > distance) {
          p1 = i;
          p2 = j;
          shortestDistance = distance;
        }
      }
    }

    System.out.println("The closest two points are " + pointString(points[p1])
     + " and " + pointString(points[p2]));
  }

  public static String pointString(double[] point) {
    return "(" + point[0] + ", " + point[1] + ", " + point[2] + ")";
  }

  public static double distance(double x1, double y1, double z1, double x2,
    double y2, double z2) {

    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) +
      (z2 - z1) * (z2 - z1));
  }
}