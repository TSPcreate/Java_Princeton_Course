
public class Minesweeper {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[] posList = new int[k];
        int c = 0;
        int[][] grid = new int[m][n];
        int[][] coord = new int[k][2];
        for (int i = 0; i < k; i++) {
            int pos = (int) (Math.random() * (m * n));
            int f = 0;
            for (int j = 0; j < c; j++) {
                if (posList[j] == pos) {
                    f = 1;
                    break;
                }
            }
            if (f == 1) {
                i -= 1;
            } else {
               // if ((pos / m) < m) {
                    // System.out.println("pos is: " + pos);
                    posList[c] = pos;
                    c++;
                    coord[i][0] = pos / n;
                    coord[i][1] = pos % n;
                   // System.out.println("y is: " + coord[i][1]);
                    // System.out.println(coord[i][0] + " " + coord[i][1]);
                //} else {
                  //  i -= 1;
                //}
            }//

        }//

        for (int i = 0; i < k; i++) {
            grid[coord[i][0]][coord[i][1]] = -1;
        }
        
        //print out grid
            
        //check each star and increment all neighbouring sides by one
        for (int i = 0; i < coord.length; i++) {
            int coord_x = coord[i][0];
            int coord_y = coord[i][1];

            //incrememnts side by 1
            for (int p = coord_x - 1; p <= coord_x + 1; p++) {
                for (int q = coord_y - 1; q <= coord_y + 1; q++) {
                    if (  p >= 0 && p < m && q >= 0 && q < n) {
                        if(grid[p][q]!=-1) {
                        grid[p][q] += 1;
                        }
                    }
                }
            }
        }
            //print out grid
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) { 
                    if (grid[i][j] == -1) { 
                        System.out.print("*  ");
                    } else { 
                        System.out.print( grid[i][j] + "  ");
                    }
                }
                // if (grid[i][n-1] == -1) { 
                //     System.out.println(" * ");
                // } else { 
                //     System.out.println(" " + grid[i][n-1] + " ");
                // }
                System.out.println("");
            }


        
    }
}
