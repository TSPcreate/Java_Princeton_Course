public class DiscreteDistribution{ 
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); 
        int args_length = args.length-1;
        int[] a = new int[args_length];
        int count = 0;
        for (int i = 0; i <= args_length-1; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int[] cumulative = new int[args_length];
        for (int s = 0; s <= cumulative.length-1; s++) { 
            if (s == 0) { 
                cumulative[s] = a[s];
                // System.out.println(cumulative[s]);

                
            } else { 
                cumulative[s] = a[s] +  cumulative[s-1];
                // System.out.println(cumulative[s]);
            }
        }
        for (int n = 0; n < m; n++) { 
            int r = (int)  (Math.random() * (cumulative[cumulative.length-1]+1));
            for (int pos = 0; pos+1 < cumulative.length; pos++) {
                    if (cumulative[pos] <= r && cumulative[pos+1] > r) {
                        System.out.print(" " + (pos+2) + " ");
                        break;
             } 
            

             
        }   
    }
  
}
}