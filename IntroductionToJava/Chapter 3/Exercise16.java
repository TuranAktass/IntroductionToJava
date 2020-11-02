public class Exercise16 {
    //Write a program that displays a random coordinate in a rectangle.
    //The rectangle is centered at (0,0) with width 100 and height 200
    public static void main(String args[]){
        int x,y;
        x = (int)(Math.random()*50);
        y = (int)(Math.random()*100);
        System.out.println("Coordinate : ");
        System.out.println("("+x+","+y+")");
    }
}
