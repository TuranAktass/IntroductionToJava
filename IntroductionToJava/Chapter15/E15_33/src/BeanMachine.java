public class BeanMachine {
    private int balls;
    private int slots;
    private boolean[][] paths;

    public BeanMachine(int balls, int slots) {
        this.balls = balls;
        this.slots = slots;
        paths = generatePaths();
    }

    private boolean [][] generatePaths(){
        boolean [][] b = new boolean[balls][slots - 1];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = (int)(Math.random() * 2) == 1 ? true : false;
            }
        }

        return b;
    }

    public boolean [][]getPaths(){
        return paths;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < paths.length; i++){
            for(int j = 0; j < paths[i].length; j++){
                sb.append(paths[i][j] ? "R" : "L");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String args[]){
        BeanMachine bm = new BeanMachine(5, 8);
        System.out.println(bm);
    }
}