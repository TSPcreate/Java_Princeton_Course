public class TrinomialBrute {
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        } else {
            if (k < -n || -k > n) {
                return 0;
            } else {
                StdOut.println(trinomial(n-1, k-1));
                
                long ans = trinomial(n-1, k-1) + trinomial(n-1, k) + trinomial(n-1, k+1);
                
                return ans;

            }
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int k = Integer.parseInt(args[1]); 
        StdOut.println(trinomial(n, k));
    }
}