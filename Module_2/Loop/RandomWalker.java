public class RandomWalker { 
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]); 
        int start_x = 0; 
        int start_y = 0;
        int distance = 0;
        int step = 0;
        while (distance < r) { 
            int direction = (int) (Math.random() * 4);
            if (direction == 0) { 
                start_y = start_y + 1;
                System.out.println("("+ start_x + ", " + start_y + ")");
                step = step + 1;
                distance = Math.abs(start_x) + Math.abs(start_y);
            }
            if (direction == 1) { 
                start_y = start_y - 1;
                System.out.println("("+ start_x + ", " + start_y + ")");
                step = step + 1;
                distance = Math.abs(start_x) + Math.abs(start_y);
            }
            if (direction == 2) { 
                start_x = start_x - 1;
                System.out.println("("+ start_x + ", " + start_y + ")");
                step = step + 1;
                distance = Math.abs(start_x) + Math.abs(start_y);
            }
            if (direction == 3) { 
                start_x = start_x + 1;
                System.out.println("("+ start_x + ", " + start_y + ")");
                step = step + 1;
                distance = Math.abs(start_x) + Math.abs(start_y);
            }
        }
        System.out.println("steps" + " = " + step);
    }
}