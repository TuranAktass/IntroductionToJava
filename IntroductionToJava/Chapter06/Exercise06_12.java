public class Exercise06_12 {

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int start = (int) (ch1);
        int end = (int) (ch2);
        int counter = 0;

        for(int i = start; i <= end; i++){
            System.out.print((char)(i) + "  ");
            counter++;

            if(counter % numberPerLine == 0){
                System.out.println();
            }    
        }
    }

    public static void main(String args[]) {
        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;
        
        printChars(ch1, ch2, numberPerLine);

    }

}
