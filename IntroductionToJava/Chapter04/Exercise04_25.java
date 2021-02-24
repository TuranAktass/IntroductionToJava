public class Exercise04_25 {
    public static void main(String args[]){
        int firstD = 65 + (int)(Math.random() * (90-65));
        int secondD = 65 + (int)(Math.random() * (90-65));
        int thirdD = 65 + (int)(Math.random() * (90-65));

        int fourthD = (int) (Math.random()*10);
        int fifthD = (int) (Math.random()*10);
        int sixthD = (int) (Math.random()*10);
        int seventhD =(int) (Math.random()*10);

        System.out.println(((char)(firstD))+""+((char)(secondD))+""+((char)(thirdD))+""
                            +fourthD+""+fifthD+""+sixthD+""+seventhD);

        
    }
    
}
