public class Exercise05_40 {
    
    public static void main(String args[]){

        int head = 0;
        int tail = 0;

        for(int i = 0; i < 1_000_000; i++){
            int coin = (int)(1 + Math.random() * 2);
            
            if(coin == 1)
                head++;
            else if(coin == 2)
                tail++;
        }

        System.out.println("Head : " + head);
        System.out.println("Tail : " + tail);
    }

}
