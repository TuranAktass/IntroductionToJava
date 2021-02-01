<<<<<<< Updated upstream
import java.util.Arrays;
public class Exercise07_13{

    public static void main(String args[]){

        System.out.println(getRandom(1,2,3,4,5,6,7,8,9,10));
    }

    public static int getRandom(int... numbers){
        int random;
        int search;

        do{
            random = (int)(Math.random() * 54) + 1;
            search = Arrays.binarySearch(numbers , random);
        }while(search >= 0);

        return random;
    }
=======

public class Exercise07_13 {

>>>>>>> Stashed changes
}
