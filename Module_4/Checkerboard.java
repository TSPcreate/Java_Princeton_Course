
public class Checkerboard {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if ((x % 2 == 0)
                        && (y % 2 == 0)) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x+0.5, y+0.5, 0.5);
                
                } else {
                    if ((x % 2 != 0) && (y % 2 != 0)) {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledSquare(x+0.5, y+0.5, 0.5);
                        
                    } else {
                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                        StdDraw.filledSquare(x+0.5, y+0.5, 0.5);
                        
                    }

                }
            }
        }
    }
}
