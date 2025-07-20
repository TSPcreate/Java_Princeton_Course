public class Ramanujan  { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 1; a <= n; a++) { 
            for(int b = 2; b <= n; b++) {   
                for (int c = 3; c<= n; c++) { 
                    for (int d = 4; d <= n; d++) { 
                    if ( 
                        a != b && 
                        a != c && 
                        a != d && 
                        b != c && 
                        c != d && 
                        b != d && 
                        a > 0 && 
                        b > 0 && 
                        c > 0 && 
                        d > 0
                    ) {
                        int a_cubed = (a*a*a);
                        int b_cubed = (b*b*b); 
                        int c_cubed = (c*c*c); 
                        int d_cubed = (d*d*d); 
                        if (
                            (a_cubed + b_cubed == c_cubed + d_cubed) &&
                            (a_cubed + b_cubed) <= n && 
                            (c_cubed + d_cubed) <= n
                        ) { 
                            System.out.println(a_cubed + " + " + b_cubed + " = " + c_cubed + " + " + d_cubed);
                            System.out.println(a_cubed + b_cubed);
                        }
                    }

                    }
                }
            }
        }
    }
}