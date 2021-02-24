public class Exercise24 {
    public static void main(String args[]){
        int rank = (int) (Math.random()*14);
        int suit = (int) (Math.random()*4);
        System.out.println("The card you picked is");

        switch(rank){
            case 0 : 
                System.out.print("Ace ");
                break;
            case 1 :
                System.out.print("2 ");
                break;
            case 2 :
                System.out.print("3 ");
                break;
            case 3 :
                System.out.print("4 ");
                break;
            case 4 :
                System.out.print("5 ");
                break;
            case 5 :
                System.out.print("6 ");
                break;
            case 6 :
                System.out.print("7 ");
                break;
            case 7 :
                System.out.print("8 ");
                break;
            case 8 :
                System.out.print("9 ");
                break;
            case 9 :
                System.out.print("10 ");
                break;
            case 10 :
                System.out.print("Jack ");
                break;
            case 11 :
                System.out.print("Queen ");
                break;
            case 12 :
                System.out.print("King ");
                break;

        }
        switch(suit){
            case 0 :
                System.out.print("of Hearts");
                break;
            case 1 :
                System.out.print("of Clubs");
                break;
            case 2 :
                System.out.print("of Diamonds");
                break;
            case 3 :
                System.out.print("of Spades");
                break;

        }
        
    }
    
}
