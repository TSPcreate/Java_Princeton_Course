public class GeneralizedHarmonic { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]); 
        double Harmonic = 0.0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) { 
                Harmonic = Harmonic + (1/(Math.pow(i, r)));
            }   
        }
        System.out.println(Harmonic);
    }
}