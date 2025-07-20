
public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int i = 1;
        int step_total = 0;
        while (i <= trials) {
            int distance = 0;
            int step = 0;
            int start_x = 0;
            int start_y = 0;
            while (distance < r) {
                int direction = (int) (Math.random() * 4);
                if (direction == 0) {
                    start_y = start_y + 1;
                
                    step = step + 1;
                    distance = Math.abs(start_x) + Math.abs(start_y);
                }
                if (direction == 1) {
                    start_y = start_y - 1;
                
                    step = step + 1;
                    distance = Math.abs(start_x) + Math.abs(start_y);
                }
                if (direction == 2) {
                    start_x = start_x - 1;
                    
                    step = step + 1;
                    distance = Math.abs(start_x) + Math.abs(start_y);
                }
                if (direction == 3) {
                    start_x = start_x + 1;
                    
                    step = step + 1;
                    distance = Math.abs(start_x) + Math.abs(start_y);
                }
            }
            step_total = step + step_total;
            i++;
        }
        double avg_step = (double) step_total/trials;
        System.out.println("average number of steps = " + avg_step);
    }
}
