public class WorldMap {
    public static void main(String[] args) {
        int x_width = StdIn.readInt();
        int y_width = StdIn.readInt();
        StdDraw.setCanvasSize(x_width, y_width);
        StdDraw.setXscale(0, x_width);
        StdDraw.setYscale(0, y_width);
        while (!StdIn.isEmpty()) {
            String Region = StdIn.readString();
            int num_vertices = StdIn.readInt();
            double[] x = new double[num_vertices];
            double[] y = new double[num_vertices];
            for (int i = 0; i < num_vertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }

    }
}
