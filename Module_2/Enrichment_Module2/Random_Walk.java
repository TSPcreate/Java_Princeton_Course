public class Random_Walk{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int x = 1;
        int y = 1;
        int start_y = (2*n +2)/2;
        int start_x = (2*n +2)/2;
        int count_step = 0;
        double step_time = 0.6;
        System.out.println("("+ start_x + " , " + start_y + ")");
        //Boundary values
        for (int i = 1; i <= (2*n + 1); i++) {
            for ( 
                int step = 0; 
                start_x != 1 && 
                start_x != (2*n + 1) && 
                start_y != 1 && 
                start_y != (2*n + 1);
                step++
            ) { 
                int direction = (int) (Math.random() * 4);
                if (direction == 0) { 
                    start_y = start_y + 1;
                    count_step = count_step+1;
                    System.out.println("("+ start_x + " , " + start_y + ")");
                }
                if (direction == 1) { 
                    start_y = start_y - 1;
                    count_step = count_step+1;
                    System.out.println("("+ start_x + " , " + start_y + ")");
                }
                if (direction == 2) { 
                    start_x = start_x + 1;
                    count_step = count_step+1;
                    System.out.println("("+ start_x + " , " + start_y + ")");
                }
                if (direction == 3) {
                    start_x = start_x - 1;
                    count_step = count_step+1;
                    System.out.println("("+ start_x + " , " + start_y + ")");
                }
            }
        }
    System.out.println("It took " + count_step + " steps to reach the boundary");
    }
}
