
public class BandMatrix {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n - 1; column++) {
                    int distance = column - row; 
                    if (distance < 0) { 
                        distance = distance * -1;
                    }

                    if ( 
                        row == column ||
                        distance <= width
                    ) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" 0 ");
                }
            

            }
            int column = (n);
            if ( 
                column == row ||
                (column-row) <= width
            ) { 
                
                System.out.println(" * ");
            } else { 
                System.out.println(" 0 ");
            }

        }
    }
}
