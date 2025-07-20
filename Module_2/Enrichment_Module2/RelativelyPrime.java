public class RelativelyPrime { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int hcf = 0;
    for (int row = 0; row <= n; row++){
        for (int column = 0; column <= n-1; column++) { 
            int row_i = row + 1;
            int column_j = column + 1;
            for (int num = 1; num <= row_i || num <= column_j; num++) { 
                if (row_i % num == 0 && column_j % num == 0) {
                    hcf = num;
                }
            }
            if (hcf == 1) { 
                System.out.print(" * ");
            } else { 
                System.out.print("   ");
            }
        
            
            
        }
        System.out.println("* ");
    }
    }
}